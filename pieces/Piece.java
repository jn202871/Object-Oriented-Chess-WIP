package pieces;

public abstract class Piece {
    private String ID;
    private boolean killed = false;
    private boolean white = false;
  
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
  
    //public abstract boolean canMove(Board board, Spot start, Spot end);

    public String ID(){
        return ID;
    }
}