import java.lang.*;

// Node Class
class LinkedList {
    Node head;

    // Node Class
    class Node{
        int data;
        Node next;

        Node(int x)
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

        return head;
    }

    public void insertEnd(int data)
    {
        Node newNode = new Node(data);

        if(head==null)
        {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next!=null)
            temp = temp.next;

        temp.next = newNode;

    }

    public void insertAfter(int n,int data)
    {
        int size = calcSize(head);

        if(n < 1 || n > size)
        {
            System.out.println("Can't insert\n");

        }
        else
        {
            Node newNode = new Node(data);
            Node temp = head;

            while(--n > 0)
                temp=temp.next;

            newNode.next= temp.next;
            temp.next = newNode;
        }
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

    public int calcSize(Node node){
        int size = 0;
        while(node!=null){
            node = node.next;
            size++;
        }
        return size;
    }
	
}
    class insertion{
    public static void main(String args[])
    {
        LinkedList listObj = new LinkedList();

        listObj.insertBeginning(15);
        listObj.insertBeginning(10);
        listObj.insertBeginning(5);

        listObj.display();

        listObj.insertEnd(20);
        listObj.insertEnd(25);
        listObj.insertEnd(30);
        listObj.insertEnd(35);

        listObj.display();

        listObj.insertAfter(3,100);

        listObj.display();
    }
}