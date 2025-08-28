// Java program to rearrange positive and negative numbers alternately
// using rotation in array

import java.util.ArrayList;
import java.util.Arrays;

class Rearrange_array_elements {

    // Function to right rotate the subarray between out-of-place
    // element and next opposite sign element
    static void rightRotate(ArrayList<Integer> arr, int start, int end) {
        int temp = arr.get(end);
        for (int i = end; i > start; i--) {
            arr.set(i, arr.get(i - 1));
        }
        arr.set(start, temp);
    }

    // Function to rearrange the array
    static void rearrange(ArrayList<Integer> arr) {
        int n = arr.size();

        for (int i = 0; i < n; i++) {

            // Check if the current positive element is out of place
            if (arr.get(i) >= 0 && i % 2 == 1) {

                // Find the next negative element and rotate the subarray
                // between these two elements
                for (int j = i + 1; j < n; j++) {
                    if (arr.get(j) < 0) {
                        rightRotate(arr, i, j);
                        break;
                    }
                }
            }

            // Check if the current negative element is out of place
            else if (arr.get(i) < 0 && i % 2 == 0) {

                // Find the next positive element and rotate the subarray
                // between these two elements
                for (int j = i + 1; j < n; j++) {
                    if (arr.get(j) >= 0) {
                        rightRotate(arr, i, j);
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, -4, -1, 4));

        rearrange(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
