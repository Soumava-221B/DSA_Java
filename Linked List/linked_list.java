/*
A linked list in Java is a linear data structure that we can use in Java Programming Language for storing a large amount of data with ease. The data stored in Linked List is not in a contiguous manner, but each data is stored at a different location, which can be accessed according to one’s need. Linked List is a preferred data structure over arrays, as inserting and deleting data in a linked list is easier than in an array.
*/

import java.lang.*;

class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int x) 
        {
            data = x;
            next = null;
        }
    }
    public Node insert(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;

        head = newNode;

        return head;
    }


    public void display()
    {
        Node node = head;
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void delete()
    {
        if (head == null){
            System.out.println("List is empty, not possible to delete");
            return;
        }

        System.out.println("Deleted: " + head.data);
        head = head.next;
    }

    
   
}
class linked_list{	 
public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insert(6);
        ll.insert(5);
        ll.insert(3);
        ll.insert(4);
        ll.insert(2);
        ll.insert(1);

        ll.display();

        ll.delete();
        ll.delete();

        ll.display();
    }
}