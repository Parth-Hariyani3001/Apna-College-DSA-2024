
public class SearchInSorted {

    public static void main(String[] args) {
        int arr[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 33;

        // Approach 1 -> Starting from top right
        // int row = 0;
        // int col = arr[0].length - 1;
        // while (row < arr.length && col > 0) {
        //     if (arr[row][col] == key) {
        //         System.out.print("Key Found at :" + row + "," + col);
        //         break;
        //     } else if (key < arr[row][col]) {
        //         col--;
        //     } else if (key > arr[row][col]) {
        //         row++;
        //     }
        // }
        // Approach 2 -> Starting from bottom left
        int row = arr.length - 1;
        int col = 0;

        while (row >= 0 && col < arr[0].length) {
            if (arr[row][col] == key) {
                System.out.print("Key Found at :" + row + "," + col);
                break;
            } else if (key < arr[row][col]) {
                row--;
            } else if (key > arr[row][col]) {
                col++;
            }
        }
    }
}
