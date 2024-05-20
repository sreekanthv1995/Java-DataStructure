package others;

import java.util.Arrays;

public class BinaryStringAndStringConcatUsingRecur {

    public static void main(String[] args) {
        String[] sortedArray = {"apple", "banana", "cherry", "grape", "orange", "pear"};
        String key = "pear";

        // Sort the array
        Arrays.sort(sortedArray);

        // Perform binary search
        int index = binarySearch(sortedArray, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        String concatenatedString = concatenateStrings(sortedArray, 0);
        System.out.println("Concatenated string: " + concatenatedString);
    }

    public static int binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = compareStrings(key, arr[mid]);

            if (cmp == 0) {
                return mid; // Key found
            } else if (cmp < 0) {
                high = mid - 1; // Search in the left half
            } else {
                low = mid + 1; // Search in the right half
            }
        }

        return -1; // Key not found
    }

    // Compare two strings based on ASCII values
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }

        return str1.length() - str2.length();
    }

    public static String concatenateStrings(String[] arr, int index) {
        // Base case: If index reaches the end of the array, return an empty string
        if (index >= arr.length) {
            return "";
        }

        // Recursively concatenate the current string with the concatenation of the rest of the array
        return arr[index] + concatenateStrings(arr, index + 1);
    }
}
