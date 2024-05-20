package searching;

public class LinearSearch {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int result = linearSearch(array,target);

        if (result == -1){
            System.out.println("not");
        }else{
            System.out.println(result);
        }
    }


    public static int linearSearch(int [] array,int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
