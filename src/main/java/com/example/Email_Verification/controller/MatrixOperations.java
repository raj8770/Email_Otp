package com.example.Email_Verification.controller;

public class MatrixOperations {

    public int[] [] transposeMatrix(int[] [] mat){
        int rows = mat.length,cols = mat[0].length;
        int[] [] transpose = new int[cols][rows];

        for (int i = 0;i<rows;i++){
            for (int j = 0;j<cols;j++){
                transpose[j][i] = mat[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[]args){
        MatrixOperations ops = new MatrixOperations();
        int[][] mat = {{1,2,3},{4,5,6}};

        int [][] transpose = ops.transposeMatrix(mat);
        System.out.println("Matrix transpose result");
        for (int[]row:transpose){
            for (int val : row){
                System.out.print(val+"");
            }
            System.out.println();
        }
    }
}
