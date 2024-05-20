package others;

import java.util.Arrays;

public class ArrayBasicWrkout {

    public static void main(String[] args) {

        int[] array = {99,2,3,4,5,6,7,8,9823789};
//        insertElement(array,80,8);
//        deleteElementFromArray(array,8);
        maxAndMinValues(array);

    }


    public static void insertElement(int [] array,int value,int position){

        for(int i = array.length-1; i >position-1; i--){
            array[i] = array[i-1];
        }
        array[position-1] = value;

        System.out.println(Arrays.toString(array));

    }

    public static void deleteElementFromArray(int [] array,int value){

        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                for (int j = i; j < array.length-1; j++){
                    array[j] = array[j+1];
                }
                break;
            }
        }

        for (int i = 0; i < array.length-1; i++) {
            System.out.println(array[i]);

        }
    }

    public static void maxAndMinValues(int [] array){

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
           if (array[i] < min){
               min = array[i];
           }
           if (array[i] > max){
               max = array[i];
           }
        }

        System.out.println(min+" "+max);

    }
}
