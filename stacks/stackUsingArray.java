//implementing stack using an array

class stacks
{
    int[]arr;
    int cap;
    int top;
    stacks(int x)
    {
        cap=x;
        arr=new int[cap];
        top=-1;
    }
    void push(int x)
    {
        if(top>cap-1)
        {
            System.out.println("Stack Overflow not enough space");
        }
        top+=1;
        arr[top]=x;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow no elements to pop");
        }
        int res=arr[top];
        top-=1;
        return res;
    }
    int peek()
    {
        //peek return the top element on the stack
        return arr[top];
    }
    int size()
    {
        //returns the size of stack since it's an array index starts from 0 size is top+1
        return top+1;
    }
    boolean isEmpty()
    {
        //tells whether the stack is empty or not
        boolean flag=false;
        if(top==-1)
        {
            flag=true;
        }
        return flag;
    }
}
class stackUsingArray
{
    public static void main(String[]args)
    {
        stacks s=new stacks(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("The top element at present is "+s.peek());
        System.out.println("The size at present is "+s.size());
        System.out.println("pop operation "+s.pop());
        System.out.println("pop operation "+s.pop());
        System.out.println("pop operation "+s.pop());
        System.out.println(s.isEmpty()?"stack is empty":"stack is not empty");
    }
}