public class ChessGame {
    public static void main(String[] args) {
        ChessPlayer queen = new Queen();
        ChessPlayer rook = new Rook();

        queen.move();
        rook.move();
    }
}

// Interface for chess players
interface ChessPlayer {
    void move();
}

// Queen class implementing ChessPlayer
class Queen implements ChessPlayer {
    @Override 
    public void move() {
        System.out.println("Queen: up, down, right, left, diagonal (all 4 directions)");
    }
}

// Rook class implementing ChessPlayer
class Rook implements ChessPlayer {
    @Override
    public void move() {
        System.out.println("Rook: up, down, right, left");
    }
}