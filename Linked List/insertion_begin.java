/*
    1. To insert a node in the beggining of a linked list, we first have to check the Head’s Reference to the first node of a linked list.

    2. If the head is equal to null, then the list is already empty else the list already has an element whose reference is stored by the head. 

    3. To insert an element, in the beginning, we will have to replace the address stored by the head with the address of the new element we wish to insert. 

    4. The address space of the previously stored element will now be stored in the pointer reference of the inserted element.
*/

import java.lang.*;

class LinkedList {
    Node head;

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
    public Node insertBeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("inserted "+data);
        return head;
    }


    public void display()
    {
        System.out.println();
        Node node = head;
        //as linked list will end when Node reaches Null
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
public class insertion_begin
{
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insertBeginning(5);
        ll.insertBeginning(4);
        ll.insertBeginning(3);
        ll.insertBeginning(2);
        ll.insertBeginning(1);

        ll.display();

    }
}