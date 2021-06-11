//In this program we will find how to reverse a linked list using 3 pointers approach
class Node{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
    }
}
class reverseLinkedList
{
    Node head;
    reverseLinkedList()
    {
        head=null;
    }
    void insertAtEnd(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else{
            Node ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
    }
    void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty ");
        }
        else
        {
            Node ptr=head;
            while(ptr!=null)
            {
                System.out.print(ptr.data+" ");
                ptr=ptr.next;
            }
            System.out.println();
        }
    }
    void reverse()
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[]args)
    {
        reverseLinkedList r1=new reverseLinkedList();
        r1.insertAtEnd(10);
        r1.insertAtEnd(20);
        r1.insertAtEnd(30);
        r1.printList();
        r1.reverse();
        r1.printList();
    }
}