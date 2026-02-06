package Recursion.ForPracticeImportantQuestions.AdvancedDSAFocusedQuestions;

public class TowerOfHanoi {

    static void toh(int n, char src, char aux, char dest){
        if(n==1){
            System.out.println("Move disk 1 from "+src+" to "+dest);
            return;
        }
        toh(n-1,src,dest,aux);
        System.out.println("Move disk "+n+" from "+src+" to "+dest);
    }
    
    public static void main(String[] args) {
        toh(3,'A','B','C');
    }
}
