public class Chess {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.output());
        //System.out.println(board.boardarray[0][1].getPiece());
        board.move(board.boardarray[1][2],board.boardarray[2][2]);
        System.out.println(board.output());
        board.move(board.boardarray[0][3],board.boardarray[3][0]);
        System.out.println(board.output());
      }
}
