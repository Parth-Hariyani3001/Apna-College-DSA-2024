
public class Pairs {

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                System.out.print("(" + n + "," + arr[k] + ")");
            }
            System.out.println();
        }
    }
}
