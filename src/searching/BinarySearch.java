package searching;

public class BinarySearch {

    public static int binarySearch(int [] array,int firstIndex,int lastIndex,int key){

        int midIndex = (firstIndex+lastIndex)/2;

        while(firstIndex <= lastIndex){
            if (array[midIndex] == key){
                return midIndex;
            } else if (array[midIndex] > key) {
                lastIndex = midIndex-1;
            }else {
                firstIndex = midIndex+1;
            }
            midIndex = (firstIndex+lastIndex)/2;
        }
        return -1;
    }

    public static int binarySearchRecur(int [] array,int firstIndex,int lastIndex,int key){

        if (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;

            if (array[midIndex] == key) {
                return midIndex;
            } else if (key > array[midIndex]) {
                return binarySearchRecur(array, midIndex + 1, lastIndex, key);
            } else {
                return binarySearchRecur(array, firstIndex, midIndex - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int [] array = {2,4,6,8,10,12,14,16,18,20};
        int first = 0;
        int last = array.length - 1;
        int key = 200;

        int result = binarySearchRecur(array,first,last,key);
        System.out.println(result);

    }
}
