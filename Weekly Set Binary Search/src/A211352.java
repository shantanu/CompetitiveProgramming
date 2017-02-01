import java.io.*;
import java.util.*;

public class A211352 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int na = in.nextInt();
    	int nb = in.nextInt();
    	int k = in.nextInt();
    	int m = in.nextInt();
    	
    	int[] a = in.nextIntArr(na);
    	int[] b = in.nextIntArr(nb);
    	
    	//binary search for largest index smaller than smallest element in second array.
    	for (int i = nb-m; i >=0; i--){
	    	int lo = 0, hi = na-1, ans = -1;
	    	while (lo <= hi) {
	    		int mid = (lo+hi)/2;
	    		if (a[mid]>=b[i]) hi = mid-1;
	    		else if (a[mid] < b[i]) {lo = mid+1; ans = mid;}
	    	}
	    	if (ans >= k-1 && a[ans] < b[i]) {
	    		System.out.println("YES");
	    		return;
	    	}
    		
    		/*for (int j = k-1; j < na; j++) {
	    		if (a[j] < b[i]) {
	    			System.out.println("YES");
	    			return;
	    		}
	    	}*/
    	}
    	System.out.println("NO");
    	
    }

	public static void main(String[] args)
    {
        in = new FastReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
        out.close();

    }

	static class FastReader {

        BufferedReader read;
        StringTokenizer tokenizer;

        public FastReader(InputStream in)
        {
            read = new BufferedReader(new InputStreamReader(in));
        }

        public String next()
        {
            while(tokenizer == null || !tokenizer.hasMoreTokens())
            {
                try{
                    tokenizer = new StringTokenizer(read.readLine());
                }catch(Exception e){
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public String nextLine(){

            try
            {
                return read.readLine();
            }
            catch(Exception e)
            {
                throw new RuntimeException(e);
            }
        }
        public int nextInt()
        {
            return Integer.parseInt(next());
        }
        public long nextLong()
        {
            return Long.parseLong(next());
        }
        public double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n)
        {
            int[] a = new int[n];
            for(int i=0; i<n; ++i)
            {
                a[i] = nextInt();
            }
            return a;
        }

        public long[] nextLongArr(int n)
        {
            long[] a = new long[n];
            for(int i=0; i<n; ++i)
            {
                a[i] = nextLong();
            }
            return a;
        }
    }


}

