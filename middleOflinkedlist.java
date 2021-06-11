/*In this program we are gonna find the middle of the linked list
  we will use two references(pointers in c++) named slow and fast 
  we will move slow ref once and fast ref twice by this slow's node data
  gives us the middle of the linked list.
  Another approach we an use is count the number of nodes and print the
  node data of count/2
*/
class Node{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
class middleOflinkedlist
{
    Node head;
    middleOflinkedlist()
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
    void findmiddle()
    {
        if(head==null)
        {
            System.out.println("List is empty ");
        }
        else{
            Node slow=head,fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println("Middle of the linked list is "+slow.data);
        }
    }
    public static void main(String[]args)
    {
        middleOflinkedlist m1=new middleOflinkedlist();
        m1.insertAtEnd(10);
        m1.insertAtEnd(20);
        m1.insertAtEnd(30);
        m1.insertAtEnd(40);
        m1.insertAtEnd(50);
        m1.findmiddle();
    }
}