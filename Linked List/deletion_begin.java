/*
Java Program Deletion of a node from the Beginning of Singly Linked List


Implementation

    1. Deletion at the start is very simple
    2. The head of the Linked list has to be moved to the next node
    3. The current head memory will automatically be deleted by the garbage collector in Java since there will be no references to it

*/

import java.lang.*;

class LinkedList {
    Node head;

    // Node Class
    class Node {
        int data;
        Node next;

        Node(int x) 
        {
            data = x;
            next = null;
        }
    }
    public void deleteStart()
    {
        if(head == null) {
            System.out.println("List is empty, not possible to delete");
            return;
        }

        System.out.println("Deleted: " + head.data);
        head = head.next;
    }

    public Node insert(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    public void display() {
        Node node = head;
        while(node!=null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("\n");
    }
}

public class deletion_begin 
{
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.insert(6);
        ll.insert(5);
        ll.insert(4);
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);

        ll.display();

        ll.deleteStart();
        ll.display();

        ll.deleteStart();
        ll.deleteStart();
        ll.deleteStart();
        ll.display();
    }
}