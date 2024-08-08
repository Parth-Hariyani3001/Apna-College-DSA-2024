public class PowerOfNOptimized {
    public static int calcPower(int num, int n) {
        if(n == 1) {
            return num;
        }
    }
    public static void main(String[] args) {
        int num = 2;
        int n = 10;
        System.out.print(calcPower(num, n));
    }
}