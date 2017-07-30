package july16;

public class One {

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		nqueen(board, 0, "");
	}

	public static void nqueen(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (isItsafe(board, row, i)) {
				board[row][i] = true;
				nqueen(board, row + 1, ans + "[" + row + " " + i + "]");
				board[row][i] = false;
			}
		}
	}

	public static boolean isItsafe(boolean[][] board, int row, int col) {
		int r = row;
		int c = col;
		for (int i = row - 1; i >= 0; i--) {
			if (board[i][c] == true) {
				return false;
			}

		}
		r = row-1;
		c = col-1;
		for (int i = row - 1; c >= 0 && i >= 0; i--) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		r = row-1;
		c = col+1;
		for (int i = row - 1; c < board.length && i >= 0; i--) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

}
