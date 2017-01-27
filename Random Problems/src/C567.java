import java.util.HashMap;
import java.util.Scanner;

public class C567 {

	public static void main(String[] args)
	   {
	       Scanner in = new Scanner(System.in);
	       int n = in.nextInt();
	       int k = in.nextInt();
	       long[] a = new long[n];
	       for(int i=0; i<n; i++) a[i] = in.nextInt();
	       int[] bef = new int[n];
	       int[] aft = new int[n];

	       HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
	       for(int i=0; i<n; i++){
	           if(a[i]%k == 0){
	               if(hm.containsKey(a[i]/k)) bef[i] += hm.get(a[i]/k);
	           }

	           if(hm.containsKey(a[i])) hm.put(a[i], hm.get(a[i])+1);
	           else hm.put(a[i],1);

	       }

	       hm.clear();

	       for(int i = n-1; i>=0; i--){
	           if(hm.containsKey(a[i]*k)) aft[i] += hm.get(a[i]*k);

	           if(hm.containsKey(a[i])) hm.put(a[i], hm.get(a[i])+1);
	           else hm.put(a[i],1);
	       }

	       long sol = 0;
	       for(int i=0; i<n; i++) sol+= bef[i] * 1L * aft[i];
	       System.out.println(sol);
	   }

}
