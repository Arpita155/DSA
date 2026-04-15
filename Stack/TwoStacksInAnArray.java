package Stack;

import java.util.Arrays;

public class TwoStacksInAnArray {

    private int []arr;
    private int s;
    private int l;

    TwoStacksInAnArray(int c){
        this.arr = new int[c];
        s = -1;
        l = arr.length;
    }

    public void push1(int x){
        if(s+1 == l){
            return;
        }
        s++;
        arr[s]=x;
    }

    public void push2(int x){
        if(l-1 == s){
            return;
        }
        l--;
        arr[l]=x;
    }

    public int pop1(){
        if(s == -1){
            return -1;
        }
        return arr[s--];
    }

    public int pop2(){
        if(l==arr.length){
            return -1;
        }
        return arr[l++];
    }
    public static void main(String[] args) {
        TwoStacksInAnArray obj = new TwoStacksInAnArray(7);
        obj.push1(2);
        obj.push1(3);
        obj.push2(4);
        obj.pop1();
        obj.pop2();
        obj.pop2();
        System.out.println(Arrays.toString(obj.arr));
    }
}
