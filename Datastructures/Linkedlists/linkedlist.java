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
  
            System.out.println("\nCreated Linked list is:"); 
            llist.printList(); 
  
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
            Node new_node = new Node(new_data);
            new_node.next = null;
            Node last = head;
            while(last.next!= null)
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
        if(temp == null)
        {
            return;
        }
        if(position == 0)
        {
            head = temp.next;
            return;
        }
        for(int i=0;temp!=null && i<position - 1;i++)
        {
            temp = temp.next;
        }
        Node next = temp.next.next;
        temp.next = next;
           
        
        
        
    }
}
       
            
            
        
 
