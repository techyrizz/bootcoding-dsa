package com.bootcoing.dsa.Rescursion;

public class Recursion1to50 {
    public static void main(String[] args) {
        print(50);
    }
    public static void print(int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
}}

