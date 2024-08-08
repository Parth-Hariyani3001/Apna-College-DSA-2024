
public class DiagonalSum {

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 25, 16}
        };
        int sum = 0;

        //Brute Force (O(n^2))
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (i == j) {
        //             sum += arr[i][j];
        //         } else if (i + j == arr.length - 1) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        // Optimized approach (O(n))
        for (int i = 0; i < arr.length; i++) {
            //primary diagonal
            sum += arr[i][i];
            //secondary diagonal
            if (i != arr.length - i - 1) {
                sum += arr[i][arr.length - i - 1];
            }
        }
        System.out.print(sum);
    }
}