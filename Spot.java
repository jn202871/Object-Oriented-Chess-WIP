import pieces.Piece;

public class Spot {
    private String Occupy = ".";
    private Piece piece;
    private int x;
    private int y;

    public Spot(int x, int y, Piece p){
        this.piece = p;
        if (this.piece != null){
        this.Occupy = piece.ID();
        }
        this.x = x;
        this.y = y;
    }

    public String getPiece(){
        return Occupy;
    }
}
