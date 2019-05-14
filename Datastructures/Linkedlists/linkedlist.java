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
            LinkedList llist = new LinkedList();
            
            llist.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            
            llist.head.next = second;
            second.next = third;
            
            llist.printList();
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
        
    }
