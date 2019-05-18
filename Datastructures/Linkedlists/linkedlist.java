import java.util.*;
class LinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;next = null;
        }
    }
        public void printList()
        {
            Node n = head;
            while(n!=null)
            {
                System.out.print(n.data+" ");
                n = n.next;
            }
                        
            
        }
        public static void main(String args[])
        {
            Scanner sc =new Scanner(System.in);
            LinkedList llist = new LinkedList();
            System.out.println("1.Insert Before");
            System.out.println("2.Insert Between");
            System.out.println("3.Insert After");
            System.out.println("4.Delete Node");
            System.out.println("Enter your choice: ");
            //int ch = sc.nextInt();
            llist.push(7); 
            llist.push(1); 
            llist.push(3); 
            llist.push(2); 
            System.out.println("Get 3rd: "+llist.getNth(3));
            System.out.println("Get 0th from last: "+llist.printNthfromLast(0));
            System.out.println("\nCreated Linked list is:"); 
            llist.printList(); 
            System.out.println();
            System.out.println("Middle element is: "+llist.getMiddle());
            System.out.println("Count of 1: "+llist.countElement(1));
            llist.deleteNode(1); // Delete node at position 4 
  
            System.out.println("\nLinked List after Deletion at position 4:"); 
            llist.printList(); 
            
            //llist.printList();
        }
        public void push(int new_data)
        {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
            
            
        }
        public void insertAfter(Node prev_node, int new_data)
        {
            if(prev_node == null)
            {System.out.println("Cannot be added");
            return;
            }
            Node new_node = new Node(new_data);
            new_node.next = prev_node.next;
            prev_node.next = new_node;           
            
        }
        public void insertEnd(int new_data)
        {
            if(head == null)
            {
                head = new Node(new_data);
                return;
            }
            Node new_node = new Node(new_data); // Create a new node
            new_node.next = null;   // Assign the next position to null
            Node last = head;
            while(last.next!= null)     // Traverse to the end and append it
            last = last.next;
            
            last.next = new_node;
            return;
        }
        public void deleteNode(int key)
        {
            Node n = head, prev = null;
            while(n.data!=key && n==null)
            { head = n.next;
                return;
            }
            while(n.data!=key && n!=null)
            {
                prev = n;
                n=n.next;
            }
            if(n == null)
            return;
            
            prev.next = n.next;
            
        
    }
    public void delete(int position)
    {
        Node temp = head, prev = null;
        if(temp == null)        // If no element in the list
        {
            return;
        }
        if(position == 0)       // If only one element is present
        {
            head = temp.next;
            return;
        }
        for(int i=0;temp!=null && i<position - 1;i++)       // traverse until the end
        {
            temp = temp.next;
        }
        Node next = temp.next.next;     // Skip the particular node
        temp.next = next;
        
    }
    public int getSize()
    {
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public boolean search(Node head, int x)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == x)      // Search for a particular element
            return true;
            
            temp = temp.next;
        }
        return false;
    }
    public int getNth(int index)
    {
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            if(count == index)
            {
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        return 0;
    }
    public int printNthfromLast(int index)
    {
        Node temp = head;int len =0 ;
        while(temp!=null)       // Finding the lenght of the list
        {
            len++;
            temp=temp.next;
        }
        //System.out.println(len);
        temp = head;
        int count = 0;
        int x = len-index-1;        // Count from the last 
        while(temp!=null)
        {
            if(count == x)
            return temp.data;
            count++;
            temp = temp.next;
        }
        
        return 0;
    }
    public int getMiddle()
    {
        Node temp = head;
        int len=0;
        while(temp!=null)       // Find the length of the list
        {
            len++;
            temp = temp.next;
        }
        temp = head;
        for(int i=0;i<(len/2);i++)      // Traverse till the middle of the list
        temp = temp.next;
        
        return (temp.data);     // Return the middle element
        
    }
    public int countElement(int num)
    {
        Node temp = head;
        int count = 0;
        while(temp!=null)   // Move until the last
        {
            if(temp.data == num)    // Check for the count
            count++;
            temp = temp.next;
        }
        return count;
    }
    public boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();      // Datastructure to keep track of elements
        while(h!=null)
        {
            if(s.contains(h))   // To check if elements are present in the hashset
            return true;
            s.add(h);
            h= h.next;
            
        }
        return false;
    }
    public void removeDuplicates(Node head)
    {
        Node curr = head; // Assign a current node
        while(curr!=null)
        {
            Node temp = curr;   // Assign temporary node
            while(temp!=null && temp.data == curr.data) // To check if consecutive elements are repeating
            {
                temp = temp.next;   // Move on to the next nodes
            }
            curr.next = temp;       // Change the current node
            curr = curr.next;
            
            
            
        }
        
        
        
    }
}
