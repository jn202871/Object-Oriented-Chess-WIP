package pieces;

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
}
