/*In this program we will find nth node from end of a linked list
  we will use two pointers approach take a first pointer and move it n times to next node
  such that it points to n+1th node then point a second point to head
  move both one node ahead till first points to null then return data at second that is our required node 
  if length is less than nth node first while loop handles this edge case
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
class nthNodefromEnd
{
    Node head;
    nthNodefromEnd()
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
    int findnthnodeFromEnd(int n)
    {
        Node first=head;
        int k=1;
        while(k<=n)
        {
            if(first==null)
            {
                return -1;
            }
            first=first.next;
            k+=1;
        }
        Node second=head;
        while(first!=null)
        {
            first=first.next;
            second=second.next;
        }
        return second.data;
    }
    public static void main(String[]args)
    {
        nthNodefromEnd n1=new nthNodefromEnd();
        n1.insertAtEnd(10);
        n1.insertAtEnd(20);
        n1.insertAtEnd(30);
        n1.insertAtEnd(40);
        n1.insertAtEnd(50);
        int node=n1.findnthnodeFromEnd(3);
        if(node==-1)
        {
            System.out.println("nth node is greater than linked list ");
        }
        else{
            System.out.println("required node is "+node);
        }
    }
}