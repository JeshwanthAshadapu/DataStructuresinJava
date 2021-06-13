//In this program dynamic stack is implemented using ArrayList

import java.util.ArrayList;
class stacks2
{
   ArrayList<Integer>al=new ArrayList<Integer>();
   void push(int x)
   {
       al.add(x); //adds at end of the arraylist
   }
   int pop()
   {
       if(al.isEmpty())
       {
           System.out.println("Stack is empty");
           return -1;
       }
       else{
            int res=al.get(al.size()-1);
            al.remove(al.size()-1);
            return res;
       }
   }
   int peek()
   {
       if(al.isEmpty())
       {
           System.out.println("Stack is empty");
           return -1;
       }
       else{
       return al.get(al.size()-1);
       }
   }
   int size()
   {
       return al.size();
   }
   boolean isEmpty()
   {
       return al.isEmpty(); //return whether the arraylist is empty or not
   }
}
class dynamicStack
{
    public static void main(String[]args)
    {
        stacks2 s2=new stacks2();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        System.out.println("The top element at present is "+s2.peek());
        System.out.println("The size at present is "+s2.size());
        System.out.println("pop operation "+s2.pop());
        System.out.println("pop operation "+s2.pop());
        System.out.println("pop operation "+s2.pop());
        System.out.println(s2.isEmpty()?"stack is empty":"stack is not empty");
    }
}