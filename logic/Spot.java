package logic;
import pieces.Piece;

public class Spot {
    private String Occupy = ".";
    private Piece piece;
    private int x;
    private int y;

    public Spot(int y, int x, Piece p){
        this.piece = p;
        if (this.piece != null){
        this.Occupy = piece.ID();
        }
        this.x = x;
        this.y = y;
    }

    public String getID(){
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

    public Piece getPiece(){
        return piece;
    }

    public int xVal(){
        return x;
    }

    public int yVal(){
        return y;
    }

    public boolean full(){
        if (piece == null) return false;
        else return true; 
    }
}
