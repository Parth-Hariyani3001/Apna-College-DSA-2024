public class SumOfNnumbers {
    public static int add(int n) {
        if(n == 1) {
            return 1;
        }
        int sum = n + add(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.print(add(n));
    }
}
