import java.util.*;
public class D211206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		
		long p2[] = new long[32];
		for (int i = 0; i < 32; i++){
			p2[i] = (long) Math.pow(2, i);
		}
		
		int count = 0;
		HashMap<Integer, Integer> mp = new HashMap();
		for (int i = 0; i < n-1; i++){
			for (int j = i+1; j < n; j++){
				long f = (long)a[i] + a[j];
				for (int k = 0; k < 32; k++){
					if (f == p2[k]) {
						count++;
						break;
					}
				}
			}
		}
		
		System.out.println(count);
	}

}
