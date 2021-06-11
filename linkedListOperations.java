class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
class singlyLinkedlist
{
    Node head;
    singlyLinkedlist()
    {
        head=null;
    }
    void insertAtBegining(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            temp.next=head;
            head=temp;
        }
    }
    void printList()
    {
        if(head==null)
        {
            System.out.println("Linkedlist is empty ");
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
        else if(head.next==null){
            head.next=temp;
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
    void insertAtPosition(int x,int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else if(x==1)
        {
            temp.next=head;
            head=temp;
        }
        else{
            Node ptr=head;
            int k=1;
            Node qtr=ptr;
            while(ptr!=null && k<x)
            {
                qtr=ptr;
                ptr=ptr.next;
                k+=1;
            }
            qtr.next=temp;
            temp.next=ptr;
        }
    }
    void deleteAtBegining()
    {
        if(head==null)
        {
            System.out.println("List is empty ");
        }
        else{
            head=head.next;
        }
    }
    void deleteAtEnd()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else if(head.next==null)
        {
            head=null;
        }
        else{
            Node ptr=head;
            Node qtr=ptr;
            while(ptr.next!=null)
            {
                qtr=ptr;
                ptr=ptr.next;
            }
            qtr.next=null;
        }
    }
    void deleteAtposition(int x)
    {
        if(head==null)
        {
            System.out.println("List is empty ");
        }
        else if(x==1){
            Node ptr=head;
            head=head.next;
            ptr=null;
        }
        else{
            Node ptr=head;
            Node qtr=ptr;
            int k=1;
            while(ptr.next!=null && k<x)
            {
                qtr=ptr;
                ptr=ptr.next;
                k+=1;
            }
            qtr.next=ptr.next;
            ptr.next=null;
        }
    }
}


class linkedListOperations
{
    public static void main(String[]args)
    {
        singlyLinkedlist l1=new singlyLinkedlist();
        l1.insertAtBegining(1);
        l1.insertAtBegining(2);
        l1.printList();
        System.out.println();
        l1.insertAtEnd(5);
        l1.insertAtEnd(6);
        l1.printList();
        System.out.println();
        l1.insertAtPosition(3,30);
        l1.insertAtPosition(4,40);
        l1.printList();
        System.out.println();
        l1.deleteAtBegining();
        l1.printList();
        System.out.println();
        l1.deleteAtEnd();
        l1.printList();
        System.out.println();
        l1.deleteAtposition(3);
        l1.printList();
    }
}