package com.bootcoing.dsa.sorting;

public class BubbleSort {
    public static void main(String[] args) {
         int arr [] = {10,67,33,900,58,47};
         Bubble(arr);
        for (int j =0 ; j< arr.length ; j++){
            System.out.println(arr[j]);
        }
    }
    public static void Bubble(int [] arr){
        int temp = 0;
        for (int i = 0 ; i < arr.length; i++){
            for (int j=0; j < arr.length - 1; j++){
                if (arr[j] > arr[j+1]){
                    temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
