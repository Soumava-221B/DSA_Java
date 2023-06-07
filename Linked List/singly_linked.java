import java.lang.*;

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

class singly_linked
{
    static Node insertStart(Node head, int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    public static Node delete(Node head)
    {
        if (head == null){
            System.out.println("List is empty, not possible to delete");
            return head;
        }

        System.out.println("Deleted: " + head.data);
        head = head.next;

        return head;
    }

    static void display(Node node) {

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("");
    }

    public static void main(String args[])
    {
        Node head = null;
        head = insertStart(head,6);
        head = insertStart(head,5);
        head = insertStart(head,4);
        head = insertStart(head,3);
        head = insertStart(head,2);
        head = insertStart(head,1);

        display(head);

        head = delete(head);
        head = delete(head);
        head = delete(head);

        display(head);


    }
}