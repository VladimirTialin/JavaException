package org.example;

public class Example2 {
    public static void main(String[] args) {
        int[] arr1={4,3,2,5,0};
        int[] arr2={2,4,1,3,2};
        printArray(divArray(arr1, arr2));

    }
    public static double[] divArray(int[] arr1,int[] arr2){
        double [] result=new double[arr1.length];
        if(arr1==null || arr2==null){
            throw new RuntimeException("Массив = null");
        }
        if(arr1.length!=arr2.length){
            throw new RuntimeException("Разная длина массивов");
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr2[i]==0){
                throw new RuntimeException("Делить на ноль нельзя");
            }
            result[i]=(double) arr1[i]/(double) arr2[i];
        }
        return result;
    }
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d] = %.2f\n", i, array[i]);
        }
    }
}
