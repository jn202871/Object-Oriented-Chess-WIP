import logic.Board;

public class Chess {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.output());
        //System.out.println(board.boardarray[0][1].getPiece());
        board.move(Board.boardarray[1][4],Board.boardarray[3][4]);
        System.out.println(board.output());
        board.move(Board.boardarray[0][4],Board.boardarray[1][4]);
        System.out.println(board.output());
        board.move(Board.boardarray[1][4],Board.boardarray[2][3]);
        System.out.println(board.output());
        board.move(Board.boardarray[2][3],Board.boardarray[2][4]);
        System.out.println(board.output());
        board.move(Board.boardarray[2][4],Board.boardarray[3][5]);
        System.out.println(board.output());
        board.move(Board.boardarray[3][5],Board.boardarray[3][4]);
        System.out.println(board.output());
        board.move(Board.boardarray[1][0],Board.boardarray[3][0]);
        System.out.println(board.output());
        board.move(Board.boardarray[0][0],Board.boardarray[2][0]);
        System.out.println(board.output());
        board.move(Board.boardarray[2][0],Board.boardarray[2][6]);
        System.out.println(board.output());
        board.move(Board.boardarray[2][6],Board.boardarray[3][6]);
        System.out.println(board.output());
        board.move(Board.boardarray[3][6],Board.boardarray[3][5]);
        System.out.println(board.output());
        board.move(Board.boardarray[3][6],Board.boardarray[6][6]);
        System.out.println(board.output());
      }
}
