/*
Reverse a linked list without changing links between nodes (Data reverse only)


Algorithm to reverse a linked list Data.

Step 1– Initialize a class.

Step 2– make head as null.

Step 3-assign tail=null also.

Step 4– A function to find the size of linked list i.e (this.size).

Step 5– Further check whether linked list is empty, (this.size() ==0).

Step 6– Traverse the node and print the linked list (node temp = head)

Step 7-print (temp.data).

Step  8– temp = temp.next

Step 9 – print (“End”).

Step 10– First add a node in at the beginning of  linked list.

Step 11– create a temp node which points towards head

Step 12– Then find if the linked list is empty.

Step 13– if it’s not then set the head such that it now points to temp node.

Step 14– Furthermore add a node at any index

Step 15– Throw new exception (“Index out of bound”)

Step 16– return temp

Step 17– take the left and right nodes to be swapped

int left=0

int right=this.size.

Step 18– swap left and right node data .

Step 19– Data will be reversed.

*/ 

class LinkedList
{
  Node head;

  // Node Class
  class Node
  {
    int data;
    Node next;

      Node (int x)		// parameterized constructor
    {
      data = x;
      next = null;
    }
  }




  public void display ()
  {
    Node temp = head;
    while (temp != null)
      {
	System.out.print (temp.data + " ");
	// Set temp to point to the next node
	temp = temp.next;
      }
    System.out.println ("END");
  }

  public Node insertBeginning (int data)
  {
    Node newNode = new Node (data);
    newNode.next = head;
    head = newNode;

    return head;
  }
  public void reverse ()
  {
    Node pointer = head;
    Node previous = null, current = null;

    while (pointer != null)
      {
	current = pointer;
	pointer = pointer.next;

	// reverse the link
	current.next = previous;
	previous = current;
	head = current;
      }

  }

}


 public class Reversed_list
{

  public static void main (String[]args)
  {
    try
    {
      LinkedList ll = new LinkedList ();
        ll.insertBeginning (2);
        ll.insertBeginning (4);
        ll.insertBeginning (6);
        ll.insertBeginning (8);
        
        System.out.println("LinkedList before reversal : ");

        ll.display ();
        
        System.out.println("LinkedList after reversal : ");

        ll.reverse ();
        ll.display ();
    }
    catch (Exception e)
    {
      System.out.println ("Exception occurred.");
    }
  }
}