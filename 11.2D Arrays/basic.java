
import java.util.*;

public class basic {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int matrix[][] = new int[3][3];
            int n = matrix.length, m = matrix[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
