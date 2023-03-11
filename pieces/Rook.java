package pieces;
import logic.Board;
import logic.Spot;

public class Rook extends Piece {
    private boolean castle = true;

    public Rook(boolean iswhite){
        super(iswhite);
        super.setID("R");
        super.setScore(5);

    }

    public boolean canCastle(){
        return castle;
    }

    public boolean checkMove(Spot start, Spot end){
        if (legal(start, end) == false) return false;
        int xMove = Math.abs(start.xVal()-end.xVal());
        int yMove = Math.abs(start.yVal()-end.yVal());
        if (xMove == 0 || yMove == 0){
            if (yMove==0){
                for (int i=start.xVal()+1; i<end.xVal(); i++){
                    if (Board.spotFull(i, start.yVal()) == true) return false;
                }
            }
            if (xMove==0){
                for (int i=start.yVal()+1; i<end.yVal(); i++){
                    if (Board.spotFull(start.xVal(), i) == true) return false;
                }
            }
        }
        return true;
    }
}
