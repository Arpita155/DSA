package Recursion;

public class CutARopeIntoMaximumPieces {

    public static int ropeCut(int rope,int a,int b,int c){
        if(rope==0){
            return 0;
        }
        if(rope<0){
            return -1;
        }
        int cutA = ropeCut(rope-a,a,b,c);
        int cutB = ropeCut(rope-b,a,b,c);
        int cutC = ropeCut(rope-c,a,b,c);

        int max = Math.max(cutA,Math.max(cutB,cutC));
        if(max == -1){
            return -1;
        }
        return (max+1);
    }
    public static void main(String[] args) {
        int rope = 7;
        int maxPieces = ropeCut(7,5,2,1);
        if(maxPieces != -1){
            System.out.println("Total "+maxPieces+" cuts possible.");
        }else{
            System.out.println("No valid cuts possible");
        }

    }
}
