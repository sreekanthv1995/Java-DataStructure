package sorting;

import java.util.Arrays;

public class InsertionSort {


    public static void insertionSort(int [] array){

        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i-1;

            while (j >=0 && array[j] > temp){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] a = {12, 11, 13, 5, 6};
        insertionSort(a);
        for (int j : a) {
            System.out.println(j);
        }
        System.out.println();
    }
}
