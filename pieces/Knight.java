package pieces;
import logic.Spot;

public class Knight extends Piece {

    public Knight(boolean iswhite){
        super(iswhite);
        super.setID("H");
        super.setScore(3);

    }

    public boolean checkMove(Spot start, Spot end){
        if (legal(start, end) == false) return false;
        return true;
    }
}
