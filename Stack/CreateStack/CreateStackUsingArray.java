package Stack.CreateStack;

import java.util.Arrays;

public class CreateStackUsingArray {
    private int []a;
    private int top;
    private int capacity;

    public CreateStackUsingArray(int c){
        this.a = new int[c];
        this.capacity=c;
        this.top = -1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void push(int value){
        // handle the overflow problem
        if(this.top == (this.capacity-1)){
            System.out.println("Error : stack full. Can't push more elements into the stack");
        }else{
            ++top;
            this.a[top]=value;
        }
    }

    public int pop(){
        // Handle the underflow problem
        if(this.isEmpty()){
            System.out.println("Error : Stack empty. can't pop elements from stack");
            return Integer.MAX_VALUE;
        }else{
            int topElement = this.a[top];
            --top;
            return topElement;
        }
    }

    public int peek(){
        if(this.isEmpty()){
            System.out.println("Error : Stack empty.");
            return Integer.MAX_VALUE;
        }
        return this.a[top];
    }

    public int size(){
        return this.top + 1;
    }

    public static void main(String[] args) {
        CreateStackUsingArray st = new CreateStackUsingArray(5);
        System.out.println(st.isEmpty());   // true
        System.out.println(st.capacity);   // 5
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.pop());   // 50 because we can not push 60 as stack is full, so it returns 50(last element)
        System.out.println(st.peek());   // 40  because 50 is poped so last element is 40
        System.out.println(st.size());
    }
}
