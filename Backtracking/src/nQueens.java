import java.util.*;
import java.util.Scanner;

public class nQueens {
	static int N;
	static boolean[] colUsed;
	static int[] board;
	static boolean[] sum;
	static boolean[] diff;
	static List<List<String>> ans;
	static int numberOfSols = 0;
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    	N = in.nextInt();;
		colUsed = new boolean[N+1];
		sum = new boolean[5*N];
		diff = new boolean[5*N];
		board = new int[N+1];
		ans = new ArrayList<>();
		rQueens(1);
		System.out.println("# solutions: " + numberOfSols);
		printAns();
    }
    
    public static void rQueens (int row) {
		if (row > N) {
			numberOfSols++;
			addSolToList();
		}
		for (int c = 1; c <= N; c++) {
			int s = row + c;
			int d = row - c + N;
			if (!colUsed[c] && !diff[d] && !sum[s]) {
				colUsed[c] = sum[s] = diff[d] = true;
				board[row] = c;
				rQueens(row + 1);
				colUsed[c] = sum[s] = diff[d] = false;
				board[row] = 0;
			}
		}
	}
	
	

	
	public static void addSolToList() {
		
		
		
		ArrayList<String> boardStrings = new ArrayList<String>();
		
		for (int i = 0; i < N; i++) {
			char[] b = new char[N];
			Arrays.fill(b, '.');
			b[board[i+1] - 1] = 'Q';
			boardStrings.add(new String(b));
		}
		//printArray(b);
		ans.add(boardStrings);
	}
	
	public static void printAns () {
		for(List<String> l: ans) {
			for (String s: l) {
				System.out.println(s);
			}
			System.out.println();
			System.out.println("---------");
			System.out.println();
		}
	}
	public static void printArray(char[][] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print("" + b[i][j]);
			}
			System.out.println();
		}
	}
	public static void printBoard() {
		for (int i = 1 ; i <= N; i++) {
			System.out.print(board[i] + " ");
		}
		System.out.println();
	}
	
}
