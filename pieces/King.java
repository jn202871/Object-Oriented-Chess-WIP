package pieces;
import logic.Spot;

public class King extends Piece {
    private boolean castle = true;

    public King(boolean iswhite){
        super(iswhite);
        super.setID("K");
        super.setScore(0);

    }

    public boolean canCastle(){
        return castle;
    }

    public boolean checkMove(Spot start, Spot end){
        if (legal(start, end) == false) return false;
        int xMove = Math.abs(start.xVal()-end.xVal());
        int yMove = Math.abs(start.yVal()-end.yVal());
        if (xMove+yMove==1) return true;
        else if (xMove==1 && yMove==1) return true;
        return false;
    }
}
