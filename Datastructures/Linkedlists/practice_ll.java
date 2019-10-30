import java.io.*;
public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static LinkedList insert(LinkedList list,int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Node last = list.head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(LinkedList list)
    {
        Node curNode = list.head;
        System.out.println("Linked List is ");
        while(curNode!=null)
        {
            System.out.print(curNode.data+" -> ");
            curNode = curNode.next;

        }
    }
    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        for(int i=0;i<5;i++)
        {
            list = insert(list,i);
        }
        printList(list);
    }
}
