
public class MaxSubarray3 {

    public static void main(String[] args) {
        // int arr[] = {-2, -3, 4, -1, -2, 1, -5, -3};
        int arr[] = {1, -2, 6, -1, 3};
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
                continue;
            }
            ms = Math.max(ms, cs);

        }
        System.out.println("Max is : " + ms);
    }
}
