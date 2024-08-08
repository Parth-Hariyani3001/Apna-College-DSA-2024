public class FirstOccurance {
    public static int firstOccurance(int arr[], int i, int k) {
        if(i == arr.length) {
            return - 1;
        }
        if(arr[i] == k) {
            return i;
        }
        return firstOccurance(arr, i + 1, k);
    }
    public static void main(String args[]) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurance(arr, 0, 5));
    }
}
