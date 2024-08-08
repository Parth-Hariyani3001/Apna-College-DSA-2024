public class FibonacciSeries {
    public static int calcFib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int fib = calcFib(n - 1) + calcFib(n - 2);
        return fib;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.print(calcFib(n));
    }
}