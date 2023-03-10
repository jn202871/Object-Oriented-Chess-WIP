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

    public int recieve(Piece piece){
        Piece temp = this.piece;
        this.piece = piece;
        this.Occupy = piece.ID();
        if (temp == null){
            return 0;
        } else return temp.score();
    }

    public void give(Spot next){
        Piece temp = this.piece;
        this.piece = null;
        this.Occupy = ".";
        next.recieve(temp);
    }
}
