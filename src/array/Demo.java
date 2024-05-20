package array;

import java.util.HashSet;
import java.util.Set;

public class Demo {

    public static void findDuplicateElement(int [] array){

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length;j++){
                if (array[i] == array[j]){
                    System.out.println(array[i]);
                }
            }
        }
    }

    public static void findDuplicateElementSer(int [] array){

        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(int num: array){
           if(!uniqueSet.add(num)){
               duplicate.add(num);
           }
        }
        System.out.println(uniqueSet);
        System.out.println(duplicate);

    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 3};
        findDuplicateElementSer(array);
    }
}
