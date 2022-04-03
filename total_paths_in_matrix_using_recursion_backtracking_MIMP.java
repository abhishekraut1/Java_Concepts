package com.company;
//Que. Count total paths to move from (0,0) to (n,m).
//Time Complexity =
public class total_paths_in_matrix_using_recursion_backtracking_MIMP {
    public  static int countPaths(int i,int j,int n,int m){ //i=rows , j=columns
        if(i==n || j==m) {
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move down
        int downPath = countPaths(i+1,j,n,m);
        //move right
        int rightPath = countPaths(i,j+1,n,m);
        return downPath+rightPath;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        int total = countPaths(0,0,m,n);
        System.out.println(total);
    }
}
