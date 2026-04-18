package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class NQueenProblemEfficientApproach {

    public static void findPosition(char[][]board, ArrayList<ArrayList<Integer>> result,int c, int n, int[]upperLeft,int[]left, int[]bottomLeft){
        if(c==n){   // Base case
            ArrayList<Integer> currentSolution = new ArrayList<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]=='Q'){
                        currentSolution.add(j + 1);      // +1 used for 1 based indexing.
                    }
                }
            }
            result.add(currentSolution);
            return;
        }

        for(int r=0;r<n;r++){
            if(left[r]!=1 && upperLeft[n-1+c-r]!=1 && bottomLeft[r+c]!=1){
                board[r][c]='Q';
                left[r]=1;
                upperLeft[n-1+c-r]=1;
                bottomLeft[r+c]=1;
                findPosition(board,result,c+1,n,upperLeft,left,bottomLeft);
                left[r]=0;
                upperLeft[n-1+c-r]=0;
                bottomLeft[r+c]=0;
                board[r][c]='.';
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of Queens : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][]board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int[]upperLeft = new int[2*n-1];
        int[]bottomLeft = new int[2*n-1];
        int[]left = new int[n];

        findPosition(board,result,0,n,upperLeft,left,bottomLeft);
        System.out.println(result);

    }
}
