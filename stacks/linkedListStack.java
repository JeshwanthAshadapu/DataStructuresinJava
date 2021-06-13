//In this program we are gonna implement stack with linkedlist
class Node{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
class linkedListStack
{
    Node head;
    int size;
    linkedListStack()
    {
        head=null;
        size=0;
    }
    void push(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size+=1;
    }
    int pop()
    {
        if(head==null)
        {
            return -1;
        }
        else{
            int res=head.data;
            head=head.next;
            size-=1;
            return res;
        }
    }
    int peek()
    {
        if(head==null)
        {
            return -1;
        }
        else{
            return head.data;
        }
    }
    int size()
    {
        return size;
    }
    boolean isEmpty()
    {
        if(head==null)
        {
            return true;
        }
        return false;
    }
    void printList()
    {
        if(head==null)
        {
            System.out.println("Stack is empty");
        }
        else{
            Node ptr=head;
            while(ptr!=null)
            {
                System.out.print(ptr.data+" ");
                ptr=ptr.next;
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        linkedListStack l1=new linkedListStack();
        l1.push(10);
        l1.push(20);
        l1.push(30);
        l1.printList();
        l1.pop();
        l1.pop();
        l1.push(40);
        l1.printList();
        System.out.println(l1.isEmpty()?"Stack is empty":"Stack is not empty");
        System.out.println("size of stack is "+l1.size());
        System.out.println("peek of stack is "+l1.peek());
    }
}