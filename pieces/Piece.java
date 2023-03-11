package pieces;
import logic.Spot;

public abstract class Piece {
    private String ID;
    private boolean killed = false;
    private boolean white = false;
    private int score;
  
    public Piece(boolean white){
        this.setWhite(white);
    }

    public void setID(String ID){
        this.ID = ID;
    }
  
    public boolean isWhite(){
        return this.white;
    }
  
    public void setWhite(boolean white){
        this.white = white;
    }
  
    public boolean isKilled(){
        return this.killed;
    }
  
    public void setKilled(boolean killed){
        this.killed = killed;
    }

    public abstract boolean checkMove(Spot start, Spot end);

    public boolean legal(Spot start, Spot end){
        if (start == end){
            System.out.println("Cannot Move To Same Spot");
            return false;
        }
        if (end.full()){
            if (start.getPiece().isWhite() == end.getPiece().isWhite()){
                System.out.println("Cannot Take Own Piece");
                return false;
            }
        }
        return true;
    }

    public String ID(){
        return ID;
    }

    public int score(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }
}