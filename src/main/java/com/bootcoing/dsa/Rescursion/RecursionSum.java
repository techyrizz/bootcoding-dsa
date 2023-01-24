package com.bootcoing.dsa.Rescursion;

public class RecursionSum {
    public static void main(String[] args) {
        System.out.println(Sum(10));
    }
    public static int Sum(int n){
        if (n != 0){
            return n + (Sum(n-1));
        }
        else {
            return n;
        }
    }
}