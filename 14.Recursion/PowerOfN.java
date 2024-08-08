public class PowerOfN {
    public static int calcPower(int num, int n) {
        if(n == 1) {
            return num;
        }
        int pow = num * calcPower(num, n - 1);
        return pow;
    }
    public static void main(String args[]) {
        int num = 2;
        int n = 3; 
        System.out.print(calcPower(num, n));
    }
}
