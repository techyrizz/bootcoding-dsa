package com.bootcoing.dsa.Rescursion;

public class RecursionArray {
    public static void main(String[] args) {


        int arr[] = {100, 200, 300, 400, 500};
        printArray(arr, 0);
    }
    public static void printArray(int [] a, int i){
        if (i==a.length){
            return;
        }
        System.out.println(a[i]);
        printArray(a,++i);
    }
}

