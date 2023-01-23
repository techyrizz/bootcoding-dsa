package com.bootcoing.dsa.array;

public class ArraySquare {
    public static void main(String[] args) {
        int[] arr = {2,4,6};
        int[] res = Array1(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
        public static int[] Array1 ( int[] x){
            for (int i = 0; i < x.length; i++) {
                x[i] = x[i] * x[i];

            }
            return x;
        }
    }
