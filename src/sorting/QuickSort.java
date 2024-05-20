package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {4,6,2,5,3,1};
        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length-1);

        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[] array,int firstIndex,int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static int pivot(int[] array,int pivotIndex,int endIndex){

        int swapIndex = pivotIndex;
        for (int i = pivotIndex+1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]){
                swapIndex++;
                swap(array,swapIndex,i);
            }
        }
        swap(array,pivotIndex,swapIndex);
        return swapIndex;
    }

    public static void quickSort(int[] array,int left,int right){
        if (left < right){
            int pivot = pivot(array,left,right);
            quickSort(array,left,pivot-1);
            quickSort(array,pivot+1,right);
        }
    }
}
