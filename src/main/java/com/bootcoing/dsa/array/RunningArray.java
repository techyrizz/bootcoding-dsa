package com.bootcoing.dsa.array;

public class RunningArray {




    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4,};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println(sum);
        }
    }
}






