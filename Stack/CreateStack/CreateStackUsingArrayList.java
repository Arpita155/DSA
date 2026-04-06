package Stack.CreateStack;

import java.util.ArrayList;

public class CreateStackUsingArrayList {

   static ArrayList<Integer> al = new ArrayList<>();

   public static boolean isEmptySt(){
       return al.size()==0;
   }

   public static void push(int value){
       al.add(value);
   }

   public static int pop(){
       // handle UNDERFLOW problem
       if(al.size()==0){
           System.out.print("Stack is empty . We can't pop element ");
           return Integer.MAX_VALUE;
       }
       int res = al.get(al.size()-1);
       al.remove(al.size()-1);
       return res;
   }

   public static int peek(){
       if(al.size()==0){
           System.out.print("Stack is empty . We can't peek element , that's why it returns the maximum value ");
           return Integer.MAX_VALUE;
       }
       return al.get(al.size()-1);
   }

   public static int sizeOfSt(){
       return al.size();
   }

    public static void main(String[] args) {

        // when stack is empty
        System.out.println("Is the stack empty : "+isEmptySt());
        System.out.println("Size of the stack is : "+sizeOfSt());
        System.out.println(pop());
        System.out.println(peek());
        System.out.println("==================================");

        // After adding element in the stack
        push(10);
        push(20);
        push(30);
        System.out.println("After adding element, stack looks like this : "+al);
        System.out.println("Is the stack empty : "+isEmptySt());
        System.out.println("Size of the stack is : "+sizeOfSt());
        System.out.println("Popped element is : "+pop());
        System.out.println("Peeked element is : "+peek());
        System.out.println("Size of the stack is : "+sizeOfSt());
    }
}
