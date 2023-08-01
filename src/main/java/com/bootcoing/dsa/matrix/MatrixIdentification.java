package com.bootcoing.dsa.matrix;
// write a program to create a matrix with maximum  zero values and identify it is sparse matrix or not
public class MatrixIdentification {
    public static void main(String[] args) {
        int count = 0;
        final int[][] matrix = {
                { 0, 2, 0 },
                { 4, 0, 6 },
                { 0, 5, 0 }
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] == 0 ){
                    count++;



                }
            }
            System.out.println();
        }
        if (count >= matrix.length/2){
            System.out.println("It is a Sparse Matrix");

        }
        System.out.println("No. of zeros are " + count);
    }
}

