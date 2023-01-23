package com.bootcoing.dsa.array;
public class ArrayNegative {
    public static void main(String[] args) {
        int[] arr = {2,4,6,-2,-76};
        int[] res = ArrayNeg(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] ArrayNeg ( int[] x){
        for (int i = 0; i < x.length; i++) {
//            x[i] = x[i] * x[i];

            if(x[i]<0){
                return x;

            }
        }
        return x;
    }
}
