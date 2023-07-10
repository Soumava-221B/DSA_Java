// Singly Linked List Insertion and Deletion in Java 

import java.lang.*;

class LinkedList {
    Node head;
    // not using parameterized constructor would by default
    // force head instance to become null
    // Node head = null;  // can also do this, but not required

    // Node Class
    class Node{
        int data;
        Node next;

        Node(int x) // parameterized constructor
        {
            data = x;
            next = null;
        }
    }
    public Node insertStart(int data)
    {
        // Creating newNode memory & assigning data value
        Node newNode = new Node(data);
        // assigning this newNode's next as current head node
        newNode.next = head;

        // re-assigning head to this newNode
        head = newNode;

        return head;
    }

    public void insertLast(int data)
    {
        // Creating newNode memory & assigning data value
        Node newNode = new Node(data);

        // if Linked List was empty, entering first node
        if(head==null)
        {
            head = newNode;
            return;
        }

        // required to traverse the Linked List
        Node temp = head;

        // traverse till the last node in Linked List
        while(temp.next!=null)
            temp = temp.next;

        // assigning the current last node's next to this newNode
        // thus newNode becomes the last node in Linked List
        temp.next = newNode;

    }

    public void insertPosition(int n,int data)
    {
        int size = calcSize(head);

        // Can only insert after 1st position
        // Can't insert if position to insert is greater than size of Linked List
        if(n < 1 || n > size)
        {
            System.out.println("Can't insert\n");

        }
        else
        {
            Node newNode = new Node(data);
            // required to traverse
            Node temp = head;

            // traverse to the nth node
            while(--n > 0)
                temp=temp.next;

            // assigning this newNode's next to nth node's next
            newNode.next= temp.next;
            // assigning the nth node's next to this newNode
            temp.next = newNode;
            // newNode added after nth node
        }
    }

    public void display()
    {
        Node node = head;
        //as linked list will end when Node reaches Null
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    // required for insertPosition() method
    public int calcSize(Node node){
        int size = 0;
        // traverse to the last node each time incrementing the size
        while(node!=null){
            node = node.next;
            size++;
        }
        return size;
    }
}

public class insertion_singly
{
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insertStart(3);
        ll.insertStart(2);
        ll.insertStart(1);

        ll.display();

        ll.insertLast(5);
        ll.insertLast(6);
        ll.insertLast(7);
        ll.insertLast(8);

        ll.display();

        //Inserts after 3rd position
        ll.insertPosition(3,25);

        ll.display();
    }
}