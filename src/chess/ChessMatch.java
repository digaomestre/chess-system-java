package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;

	public ChessMatch() {

		board = new Board(8, 8);
	}

	public ChessPiece[][] getPiece() {

		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

		for (int x = 0; x < board.getRows(); x++) {
			for (int i = 0; i < board.getColumns(); i++) {

				mat[x][i] = (ChessPiece) board.getPiece(x, i);
			}
		}
		return mat;
	}
}
