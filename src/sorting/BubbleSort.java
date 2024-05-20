package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int [] bubbleSort(int [] array){
        for (int i = 0; i < array.length-1; i++){
            int flag = 0;
            for(int j = 0; j < array.length-1-i; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = 1;

                }
            }
            if (flag == 0){
                System.out.println(flag);
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int [] a = {2,1,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(bubbleSort(a)));

    }
}
