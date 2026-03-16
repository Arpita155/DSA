package Recursion;

import java.util.ArrayList;

public class NQueenProblem {

    public static ArrayList<ArrayList<Integer>> nQueen(int n){
        int[][]board = new int[n][n];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        findPosition(board,0,n,result);
        return result;
    }

    public static void findPosition(int[][]board, int col, int n, ArrayList<ArrayList<Integer>> result){
        if(col==n){
            ArrayList<Integer> currentSolution = new ArrayList<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]==1){
                        currentSolution.add(j + 1);      // +1 used for 1 based indexing.
                    }
                }
            }
            result.add(currentSolution);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(board,row,col)){
                board[row][col]=1;
                findPosition(board,col+1,n,result);
                board[row][col]=0;
            }
        }
    }

    public static boolean isSafe(int[][]board, int row, int col){
        // top left checking
        int i=row;
        int j=col;
        while (i>=0 && j>=0){
            if(board[i][j]==1){
                return false;
            }
            i--;
            j--;
        }

        // left checking
        i=row;
        j=col;
        while (j>=0){
            if(board[i][j]==1){
                return false;
            }
            j--;
        }

        // bottom-left checking
        i=row;
        j=col;
        while (i<board[0].length && j>=0){
            if(board[i][j]==1){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(nQueen(4));
    }

}
