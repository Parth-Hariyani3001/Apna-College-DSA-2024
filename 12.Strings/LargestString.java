
public class LargestString {

    public static void main(String[] args) {
        String[] strArr = {"apple", "mango", "banana"};
        String largestString = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            if (largestString.compareTo(strArr[i]) < 0) {
                largestString = strArr[i];
            }
        }
        System.out.print(largestString);
    }
}
