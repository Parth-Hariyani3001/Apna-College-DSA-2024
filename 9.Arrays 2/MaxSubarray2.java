
public class MaxSubarray2 {

    public static void main(String args[]) {
        int arr[] = {1, -2, 6, -1, 3};
        int sum;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }

                max = Math.max(sum, max);
            }
        }
        System.out.print("Max is : " + max);
    }
}
