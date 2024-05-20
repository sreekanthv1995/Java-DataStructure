package mergesort;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int [] a1,int[] a2){

        int [] combined = new int[a1.length + a2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < a1.length && j < a2.length){
            if(a1[i] < a2[j]){
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



    public static int [] mergeSort(int [] array){

        if (array.length == 1) return array;
        int midIndex = array.length/2;
        int [] left = mergeSort(Arrays.copyOfRange(array,0,midIndex));
        int [] right = mergeSort(Arrays.copyOfRange(array,midIndex,array.length));
        return merge(left,right);

    }

    public static void main(String[] args) {

        int[] a1 = {1,3,7,8,2,4,5,6};


        int [] sortedArray = mergeSort(a1);

//        int [] merge = merge(a1,a2);
//        System.out.println(Arrays.toString(merge));
//
//        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(sortedArray));


    }
}
