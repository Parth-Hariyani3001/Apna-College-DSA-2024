
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void main(String[] args) {
        //For Ascending//
        int arr[] = {4, 3, 2, 3, 1, 6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Arrays.sort(arr,0,2); -> to sort in range

        System.out.println("");

        //For Descending//
        Integer arr2[] = {1, 2, 3, 4, 5};
        Arrays.sort(arr2, Collections.reverseOrder());
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        // Arrays.sort(arr2, 0, 3, Collections.reverseOrder()); -> to sort in range
    }
}
