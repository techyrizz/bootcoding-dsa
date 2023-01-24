package com.bootcoing.dsa.array;

public class CountMax {
    public static void main(String[] args) {
        System.out.println(maximumCount(new int []{-2,-1,-1,1,2,5,5,3}));
    }

    public static int maximumCount(int[] nums) {
        int positive = 0;
        int negative = 0;
        for (int i = 0 ; i < nums.length ; i ++){
            if (nums[i] > 0){
                positive++;
            }
            else {
                negative++;
            }
        }
        if (positive > negative){
            return positive;
        }
        else {
            return negative;
        }
    }
}
