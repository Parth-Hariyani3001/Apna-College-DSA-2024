
public class SelectionSort {

    public static void main(String args[]) {
        int arr[] = {7, 8, 3, 1, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestNumIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestNumIdx] > arr[j]) {
                    smallestNumIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestNumIdx];
            arr[smallestNumIdx] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
