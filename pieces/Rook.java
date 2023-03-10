package pieces;

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
}
