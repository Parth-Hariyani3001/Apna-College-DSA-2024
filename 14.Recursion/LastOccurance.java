public class LastOccurance {
    public static int lastOccurance(int arr[],int i, int k) {
        if(i == -1) {
            return - 1;
        }
        if(arr[i] == k) {
            return i;
        }
        return lastOccurance(arr, i - 1, k);
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurance(arr, arr.length - 1, 5));
    }
}
