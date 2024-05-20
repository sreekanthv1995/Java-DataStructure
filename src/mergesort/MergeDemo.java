package mergesort;

import java.util.Arrays;

public class MergeDemo {
    public static void main(String[] args) {
        int[] array = {9,2,5,1,4,0,3,7,6,8,10};
        System.out.println(Arrays.toString(array));
        int[] sorted = mergeSort(array);
        System.out.println(Arrays.toString(sorted));

    }

    public static int[] merge(int[] a1, int[] a2){
        int [] combined = new int[a1.length+a2.length];
        int index = 0;
        int i = 0;
        int j = 0;


        while (i < a1.length && j < a2.length){

            if (a1[i] < a2[j]){
                combined[index] = a1[i];
                index++;
                i++;
            }else {
                combined[index] = a2[j];
                index++;
                j++;
            }
        }

        while (i < a1.length){
            combined[index] = a1[i];
            index++;
            i++;
        }
        while (j < a2.length){
            combined[index] = a2[j];
            index++;
            j++;
        }
        return combined;
    }

    public static int[] mergeSort(int [] array){

        if (array.length == 1) return array;
        int mid = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(array,mid,array.length));
        return merge(left,right);
    }
}
