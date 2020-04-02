import java.util.ArrayList;
import java.util.Scanner;
public class LinkedList {
	Node head;
//	public static void main(String args[]){
//		LinkedList llist = new LinkedList();
//		llist.push(7);
//		llist.push(1);
//		System.out.println("\nCreated Linked list is: ");
//		llist.printList();
//	}
	
	// GET A NODE
	public Node getNode(int n){
		int count = 1;
		Node tmp = head;
		while(tmp!=null)
		{
			if(count==n)
				return tmp;
			count++;
			tmp = tmp.next;
		}
		return null;
	}
	// MAKE THE LINKED LIST CIRCULAR LINKED LIST
	public void circular()
	{
		Node start = head;
		while(head.next!=null)
		{
			head = head.next;
		}
		head.next = start;
		head = start;
	}
	
	// PRINTING THE ENTIRE LIST
	public void printList(){
		Node tnode = head;
		while(tnode!=null){
			System.out.println(tnode.data+" ");
			tnode = tnode.next;
		}
	}
	// PRINTING THE ENTIRE CIRCULAR LIST
		public void printCircularList(){
			Node tnode = head;
			while(tnode.next!=head){
				System.out.println(tnode.data+" ");
				tnode = tnode.next;
			}
			System.out.println(tnode.data);
		}
	
	// INSERT FIRST
	public void push(int new_data){	
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	// INSERT LAST
	public void append(int new_data){
		Node new_node = new Node(new_data);
		if(head==null)
		{
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next!=null){
			last = last.next;
		}
		last.next = new_node;
		return;
	}
	
	// INSERT AFTER
	public void insertAfter(int new_data,Node prev_node){
		if(prev_node == null){
			System.out.println("The previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	// 2.1 My approach
	// REMOVE DUPLICATES IN UNSORTED ARRAY
	public void removeDuplicates(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Node temp = head;
		while(temp!=null){
			if(arr.contains((int)temp.data)==false)
			{
				System.out.println(temp.data);
				arr.add((int)temp.data);
				temp = temp.next;
			}
		}
	}
	
	// 2.1 Solution without using temporary buffer
	// REMOVE DUPLICATES IN UNSORTED ARRAY WITHOUT USING TEMPORARY BUFFER
	public void removeDuplicatesNoTempBuffer(){
		if(head == null)return;
		Node previous = head;
		Node current = previous.next;
		while(current!=null){
			Node runner = head;
			while(runner!=current){	// Check for earlier duplicates
				if(runner.data == current.data){
					Node tmp = current.next;	// Remove current
					previous.next = tmp;
					current = tmp;	// Update current to next node
					break;	// all other duplicates have been removed
				}
				runner = runner.next;
			}
			if(runner == current){	// current not updated - update now
				previous = current;
				current = current.next;
			}
		}	
		
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	// 2.2
	// FIND THE N TH NODE FROM THE LAST ELEMENT - MY APPROACH
	public Node nthElementFromLast(int n){
		Node temp = head;
		int count = 1;
		while(temp!=null){
			count+=1;
			temp = temp.next;
		}
		temp = head;
		n = count - n;
		count = 1;
		while(temp!=null){
			if(n==count)
				break;
			count++;
			temp = temp.next;
		}
		return temp;
	}
	
	// 2.2
	// FIND THE NTH NODE FROM THE LAST ELEMENT - SOLUTION
	public Node nthElementFromLastSolution(int n){
		if(head == null || n<1)return null;
		Node p1=head,p2=head;	// Set the initial headers
		for(int j=0;j<n-1;j++){			// Move by n-1 positions, to create a distance of 'n' between p1 and p2
			if(p2==null)return null;	
			p2 = p2.next;				// Moving p2 by n distance from p1
		}
		while(p2.next!=null){			// Now, moving p2 to last, and return the value of p1, with the original distance 
			p1 = p1.next;				// between them is fixed
			p2 = p2.next;
		}
		return p1;
	}
	
	// 2.3
	// DELETE A NODE IN THE MIDDLE OF THE LINKED LIST, GIVEN ACCESS ONLY TO THAT NODE
	public void deleteMiddleNode(Node middle){
		if(middle==null)return;
		while(middle.next.next!=null)
		{
			middle.data = middle.next.data;
			middle = middle.next;
		}
		middle.data = middle.next.data;
		middle.next = null;
	}
	
	// 2.4
	// GIVEN 2 LINKED LISTS, FIND A NEW LINKED LIST WITH THE CORRESPONDING SUMMATION OF BOTH
	public LinkedList sumOfLinkedList(LinkedList a)
	{
		LinkedList c = new LinkedList();
		Node ahead = a.head;
		Node temp =head;
		if(ahead==null || temp==null)return null;
		int carry = 0;
		while(ahead!=null && temp!=null)
		{
			int sum = ahead.data + temp.data+carry;
			if(sum>=10)
			{
				carry = (int)sum/10;
				sum = (int)sum%10;
			}
			c.push(sum);
			ahead = ahead.next;
			temp = temp.next;
		}
		return c;
	}
	
	// 2.5
	// GIVEN A CIRCULAR LINKED LIST, FIND THE STARTING NODE OF A LOOP
	public Node loopStartNode()
	{
		Node n1 = head;
		Node n2 = head;
		// Find meeting point
		while(n2.next!=null)
		{
			n1 = n1.next;
			n2 = n2.next.next;
			if(n1 == n2)
				break;
		}
		// Error check- there is no meeting point and therefore no loop
		if(n2.next==null)
			return null;
		// Move n1 to head. Keep n2 at meeting point. Each are k steps from loop start
		// If they move at same pace, they must meet at loop start
		n1 = head;
		while(n1!=n2)
		{
			n1 = n1.next;
			n2 = n2.next;
		}
		// Now n2 points to the start of the loop
		return n2;
	}
}
