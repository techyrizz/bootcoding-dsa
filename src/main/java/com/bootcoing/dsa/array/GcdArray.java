package com.bootcoing.dsa.array;
public class GcdArray {
    public static void main(String[] args) {
        System.out.println(findGCD(new int []{10,67,33,900,58,47}));
    }
    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int gcd = 1;
        for (int i = 1; i <= min && i <= max; i++) {
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
