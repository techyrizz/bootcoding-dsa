package com.bootcoing.dsa.Rescursion;

public class RecursionEx2 {
    public static void main(String[] args) {
        evenNum(20);
    }
    public static void evenNum(int n){
        if (n==1){
            return;
        }
        evenNum(n-1);
        if(n%2 ==0){
            System.out.println(n);
        }
        }

    }

