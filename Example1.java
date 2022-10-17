package org.example;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] arr1={4,3,2,5,3};
        int[] arr2={2,4,1,3,7};
        System.out.println(Arrays.toString(difArray(arr1, arr2)));
    }
    public static int[] difArray(int[] arr1,int[] arr2){
        int [] result=new int[arr1.length];
        if(arr1==null || arr2==null){
            throw new RuntimeException("Массив = null");
        }
        if(arr1.length!=arr2.length){
            throw new RuntimeException("Разная длина массивов");
        }
        for (int i = 0; i < arr1.length; i++) {
            result[i]=arr1[i]-arr2[i];
        }
        return result;
    }
}