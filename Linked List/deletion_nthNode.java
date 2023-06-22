/*
Java Program for Deletion from the nth position in a Linked List

Implementation
1. Take the Linked List input from the user and calculate the length of the Linked List.
2. Accept the nth node that the user wants to delete.
3. Check if the value of n is valid should not be negative or 0 and should not exceed the size of Linked List.
4. If the user wants to delete the first node then just change the header to next in the Linked List.
5. Else go ahead and traverse the Linked List to the nth node.
6. Change the next of (n-1)th node to (n+1)th node.
7. Done we have deleted the nth node its memory will automatically be deleted since there are no references to it.

*/

import java.lang.*;

class LinkedList {
    Node head;

    // Node Class
    class Node{
        int data;
        Node next;

        Node(int val)
        {
            data = val;
            next = null;
        }

    }

    public void deleteNthNode(int n)
    {
        int len = calcLen(head);

        // Can only insert after 1st position
        // Can't insert if position to insert is greater than size of Linked List
        if(n < 1 || n > len)
        {
            System.out.println("Can't delete\n");

        }
        else
        {
            if(n == 1)
            {
                // head has to be deleted
                System.out.println("Deleted: " + head.data);
                head = head.next;
                return;
            }
            // required to traverse
            Node temp = head;
            Node previous = null;

            // traverse to the nth node
            while(--n > 0) {
                previous = temp;
                temp = temp.next;
            }
            // assigned next node of the previous node to nth node's next
            previous.next = temp.next;
            System.out.println("Deleted: " + temp.data);
        }
    }
    public void insert(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void showList()
    {
        Node temp = head;
        //as linked list will end when Node reaches Null
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public int calcLen(Node temp){
        int len = 0;

        while(temp!=null){
            temp = temp.next;
            len++;
        }
        return len;
    }
}

public class deletion_nthNode
{
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insert(35);
        ll.insert(34);
        ll.insert(33);
        ll.insert(32);
        ll.insert(31);
        ll.insert(30);

        ll.showList();

        ll.deleteNthNode(3);
        ll.deleteNthNode(4);
        ll.showList();
    }
}