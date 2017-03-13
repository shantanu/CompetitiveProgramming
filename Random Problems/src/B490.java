import java.util.Scanner;

public class B490 {
	static public void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int[] pn = new int[1000000];
		int[] np = new int[1000000];
		int[] queue = new int[n];
		for (int i = 0; i < n; i++) {
			int prev = in.nextInt();
			int next = in.nextInt();
			pn[prev] = next;
			np[next] = prev;
		}
		int temp = 0;
		for (int i = 1; i < n; i+=2) {
			queue[i] = pn[temp];
			np[temp] = 0;
			pn[temp] = 0;
			temp = pn[queue[i]];
			
			
		}
		
		if (n%2 == 0) {
			temp = 0;
			for (int i = n-2; i >=0; i-=2) {
				queue[i] = np[temp];
				temp = np[temp];
			}
		}
		else {
			for (int i = 0; i < 1000000; i++) {
				if (np[i]!=0){
					temp = np[i];
					break;
				}
			}
					
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(queue[i] + " ");
		}
	}
}
