import java.util.*;
public class A598 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long[] p2 = new long[31];
		for (int i = 0; i < 31; i++) p2[i] = (int) Math.pow(2, i);
		
		int t = in.nextInt();
		
		for (int i = 1; i <= t; i++) {
			long a = in.nextLong();
			long sum = a*(a+1)/2;
			for (int j = 30; j >= 0; j--) {
				if (p2[j] > a)
					continue;
				else{
					sum -= 2*p2[j];
				}
			}
			System.out.println(sum);
			
		}
	}

}
