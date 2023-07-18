import java.lang.*;

class LinkedList {
    Node head;
    int size = 0;

    // Node Class 
    class Node {
        int data;
        Node next;

        Node(int x) // parametrized constructor
        {
            data = x;
            next = null;
        }
    }
    public void insert(int data) 
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void insertMiddle(int data) {
        Node newNode = new Node(data);

        // if the LL was empty
        if(head == null) {
            newNode.data = data;
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Node temp = head;

        int mid = (size % 2 == 0) ? (size/2) : (size+1)/2;

        while(--mid > 0) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
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
}

public class insertion_middle {
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insert(80);
        ll.insert(0);

        ll.display();

        ll.insertMiddle(20);
        ll.display();

        ll.insertMiddle(60);
        ll.display();

        ll.insertMiddle(40);
        ll.display();
    }
}