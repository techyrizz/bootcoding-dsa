package com.bootcoing.dsa.array;

public class PlusOnee {
    public static void main(String[] args) {
        PlusOnee.plusOne(new int[]{1, 2, 9});

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i]<9) {
                System.out.println(digits[i] + 1);
                digits[i] = digits[i] + 1;
                System.out.println(digits[i] = 0);
            }
            return digits;

        }
        return digits;
    }
}



