package pieces;
import logic.Spot;

public class Pawn extends Piece {
    private boolean firstMove = true;

    public Pawn(boolean iswhite){
        super(iswhite);
        super.setID("P");
        super.setScore(1);

    }

    public boolean checkMove(Spot start, Spot end){
        if (legal(start, end) == false) return false;
        int move = super.isWhite() ? 1 : -1;

        if (start.xVal() == end.xVal() && start.yVal()+move == end.yVal() && (start.getPiece().isWhite() != end.getPiece().isWhite()) == false) return true;

        else if ((start.xVal() == end.xVal()+1 || start.xVal() == end.xVal()-1) && start.yVal()+move == end.yVal() && (start.getPiece().isWhite() != end.getPiece().isWhite()) == true) return true;

        else if (start.xVal() == end.xVal() && start.yVal()+move+move == end.yVal() && firstMove == true){
            this.firstMove = false;
            return true;
        }

        return false;
    }
}
