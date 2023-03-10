import pieces.*;

public class Board {
    public Spot[][] boardarray = new Spot[8][8];

    public Board(){
        resetBoard();
    }

    public void resetBoard(){
        // initialize white pieces
        boardarray[0][0] = new Spot(0, 0, new Rook(true));
        boardarray[0][1] = new Spot(0, 1, new Knight(true));
        boardarray[0][2] = new Spot(0, 2, new Bishop(true));
        boardarray[0][3] = new Spot(0, 3, new Queen(true));
        boardarray[0][4] = new Spot(0, 4, new King(true));
        boardarray[0][5] = new Spot(0, 5, new Bishop(true));
        boardarray[0][6] = new Spot(0, 6, new Knight(true));
        boardarray[0][7] = new Spot(0, 7, new Rook(true));

        boardarray[1][0] = new Spot(1, 0, new Pawn(true));
        boardarray[1][1] = new Spot(1, 1, new Pawn(true));
        boardarray[1][2] = new Spot(1, 2, new Pawn(true));
        boardarray[1][3] = new Spot(1, 3, new Pawn(true));
        boardarray[1][4] = new Spot(1, 4, new Pawn(true));
        boardarray[1][5] = new Spot(1, 5, new Pawn(true));
        boardarray[1][6] = new Spot(1, 6, new Pawn(true));
        boardarray[1][7] = new Spot(1, 7, new Pawn(true));
        
  
        // initialize black pieces
        boardarray[7][0] = new Spot(7, 0, new Rook(false));
        boardarray[7][1] = new Spot(7, 1, new Knight(false));
        boardarray[7][2] = new Spot(7, 2, new Bishop(false));
        boardarray[7][3] = new Spot(7, 3, new Queen(false));
        boardarray[7][4] = new Spot(7, 4, new King(false));
        boardarray[7][5] = new Spot(7, 5, new Bishop(false));
        boardarray[7][6] = new Spot(7, 6, new Knight(false));
        boardarray[7][7] = new Spot(7, 7, new Rook(false));
        
        boardarray[6][0] = new Spot(6, 0, new Pawn(false));
        boardarray[6][1] = new Spot(6, 1, new Pawn(false));
        boardarray[6][2] = new Spot(6, 2, new Pawn(false));
        boardarray[6][3] = new Spot(6, 3, new Pawn(false));
        boardarray[6][4] = new Spot(6, 4, new Pawn(false));
        boardarray[6][5] = new Spot(6, 5, new Pawn(false));
        boardarray[6][6] = new Spot(6, 6, new Pawn(false));
        boardarray[6][7] = new Spot(6, 7, new Pawn(false));
  
        // initialize remaining boardarray without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boardarray[i][j] = new Spot(i, j, null);
            }
        }
    }

    public String output() {
        String brdStr = "";
        brdStr += "  0 1 2 3 4 5 6 7\n";
        for(int i = 0; i < 8; i++){
            brdStr += i + "";
            for(int j =0; j < 8; j++){
                brdStr += (" " + boardarray[i][j].getPiece());    
            }
            brdStr += "\n";
        }
    return brdStr;
    }

    public void move(Spot start, Spot end){
        start.give(end);
    }
}
