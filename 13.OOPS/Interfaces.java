
public class Interfaces {

    public static void main(String[] args) {

    }
}

interface ChessPlayer {

    void moves();
}

class Queen implements ChessPlayer {

    public void moves() {
        System.out.print("up,down,left,right, diagonal (in all 4 directions)");
    }
}

class King implements ChessPlayer {

    public void moves() {
        System.out.println("up, down, left, right (in all 4 directions)");
    }

}
