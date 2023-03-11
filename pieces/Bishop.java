package pieces;
import logic.Spot;

public class Bishop extends Piece {

    public Bishop(boolean iswhite){
        super(iswhite);
        super.setID("B");
        super.setScore(3);

    }

    public boolean checkMove(Spot start, Spot end){
        if (legal(start, end) == false) return false;
        return true;
    }

}
