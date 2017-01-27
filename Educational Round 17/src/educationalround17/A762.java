package educationalround17;
import java.util.*;

public class A762 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		long k = in.nextLong();
		long count = 0;
		boolean isSqrt = false;
		HashMap<Long, Long> hm = new HashMap();
		for(long i = 1; i*i <= n; i++) {
			if (n % i == 0) {
				count++;
				if (i*i == n)
					isSqrt = true;
				hm.put(count, i);
				
				
				if (count == k){
					System.out.println(i);
					return;
				}
			}
		}
		if (isSqrt) {
			if (count*2 - 1 >= k){
				System.out.println(n/hm.get(count * 2 - k));
				return;
			}
			else {
				System.out.println("-1");
				return;
			}
		}
		else{
			if (count*2 >= k){
		
				System.out.println(n/hm.get(count * 2 - k + 1));
				return;
			}
		
			if (count*2 < k){
				System.out.println("-1");
				return;
			}
		}
		
	}

}
