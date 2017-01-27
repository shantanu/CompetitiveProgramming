import java.util.*;

public class CodeforcesRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int T = Integer.parseInt(in.next());
		
		for (int i = 0; i < T; i++){
			int N = Integer.parseInt(in.next());
			int R = Integer.parseInt(in.next());
			int ratingSum = 0;
			for (int j = 0; j < N; j++){
				ratingSum += Integer.parseInt(in.next());
			}
			if (ratingSum + 1500 == R){
				System.out.println("Correct");
			}
			else {
				System.out.println("Bug");
			}
		}
	}

}


