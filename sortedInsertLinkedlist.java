class Node{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
class sortedInsertLinkedlist
{
    Node head;
    sortedInsertLinkedlist()
    {
        head=null;
    }
    void insertinsortedorder(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else if(data<head.data){
            temp.next=head;
            head=temp;
        }
        else{
            Node ptr=head;
            while(ptr.next!=null && ptr.next.data<data)
            {
                ptr=ptr.next;
            }
            temp.next=ptr.next;
            ptr.next=temp;
        }
    }
    void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty ");
        }
        else{
            Node ptr=head;
            while(ptr!=null)
            {
                System.out.print(ptr.data+" ");
                ptr=ptr.next;
            }
        }
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
    public static void main(String[]args)
    {
        sortedInsertLinkedlist s1=new sortedInsertLinkedlist();
        s1.insertAtEnd(10);
        s1.insertAtEnd(20);
        s1.insertAtEnd(30);
        s1.insertAtEnd(40);
        s1.insertAtEnd(50);
        s1.printList();
        System.out.println();
        s1.insertinsortedorder(45);
        s1.printList();
    }
}