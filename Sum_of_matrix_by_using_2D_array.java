package com.company;

public class Sum_of_matrix_by_using_2D_array {
    public static void main(String[] args) {
        int[][] mat1 = {{23,3,44},
                        {8,9,2}};
        int[][] mat2 = {{2,0,74},
                        {2,5,8}};
        int[][] result = {{0,0,0},
                         {0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.printf(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
