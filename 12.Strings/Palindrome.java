
public class Palindrome {

    public static void main(String[] args) {
        String str = "racecar";
        int i = 0, j = str.length() - 1;
        boolean isPali = true;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPali = false;
                break;
            }
            i++;
            j--;
        }
        System.out.print(isPali);
    }
}
