package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int [] array){

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int [] array = {2, 5, 3, 8, 1, 9};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
