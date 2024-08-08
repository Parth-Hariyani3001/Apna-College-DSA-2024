
public class ShortestPath {

    public static void main(String[] args) {
        String coordinates = "WNEENESENNN";
        int x = 0;
        int y = 0;
        float path = 0f;

        for (int i = 0; i < coordinates.length(); i++) {
            if (coordinates.charAt(i) == 'W') {
                x--;
            } else if (coordinates.charAt(i) == 'N') {
                y++;
            } else if (coordinates.charAt(i) == 'E') {
                x++;
            } else if (coordinates.charAt(i) == 'S') {
                y--;
            }
        }

        path = (float) (Math.sqrt((x * x) + y * y));
        System.out.print(path);
    }
}
