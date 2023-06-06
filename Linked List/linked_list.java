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