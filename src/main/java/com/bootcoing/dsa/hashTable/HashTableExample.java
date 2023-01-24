package com.bootcoing.dsa.hashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Objects;

public class HashTableExample {
    public static void main(String[] args) {
        int arr[] = {10,20,30,10,20};

        HashMap<Integer , Integer> store = new HashMap();
        for (int i = 0 ; i< arr.length; i++){
            if (store.containsKey(arr[i])){
                int value =  store.get(arr[i]);
                store.put(arr[i], value+1);
            }else {
                store.put(arr[i], 1);
            }
        }
        for(Integer key : store.keySet()){
            int k =  key;
            int value =  store.get(key);
            if (value > 1){
                System.out.println(key);
            }
        }
    }
}
