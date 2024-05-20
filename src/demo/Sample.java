package demo;

import java.util.Arrays;

public class Sample {

    public static void main(String[] args) {

        String [] array = {"rahul","sreekanth","aravind","abhijith"};
        String target = "rahul";

        int result = binarySearch(array,target);

        System.out.println(result);
//        int low = 0;
//        int high = array.length - 1;
//        int mid = (high + low) / 2;
//
//        int res = target.compareTo(array[mid]);
//        System.out.println(res);

    }

    private static int binarySearch(String[] array, String target) {
        int low = 0;
        int high = array.length - 1;

        Arrays.sort(array);

        while (low <= high){
//            int mid = (high + low) / 2;
            int mid = low + (high - low) / 2;

            int res = target.compareTo(array[mid]);

            if(res == 0){
                return mid;
            } else if (res > 0) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
