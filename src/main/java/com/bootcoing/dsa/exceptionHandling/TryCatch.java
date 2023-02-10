package com.bootcoing.dsa.exceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr = {32, 43, 54, 23, 77};
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("Program ends");
    }
}
