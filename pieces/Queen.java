package pieces;
import logic.Spot;

public class Queen extends Piece {

    public Queen(boolean iswhite){
        super(iswhite);
        super.setID("Q");
        super.setScore(9);

    }

    public boolean checkMove(Spot start, Spot end){
        if (legal(start, end) == false) return false;
        return true;
    }
}
