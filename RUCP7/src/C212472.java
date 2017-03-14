import java.io.*;
import java.util.*;

public class C212472 {

    static FastReader in = null;
    static PrintWriter out = null;
    static int maxfa;
    static int[] maxfaseq;
    public static void solve()
    {
    	int n = in.nextInt();
    	int k = in.nextInt();
    	int[] a = in.nextIntArr(n);
    	maxfa = 0;
    	maxfaseq = new int[n];
    	
    	
    	int[] seqlen = new int[n];
    	seqlen[0] = a[0] == 1 ? 1:0;
    	for (int i = 1; i < n; i++) {
    		seqlen[i] = a[i] == 1? seqlen[i-1]+1: 0;
    		if (seqlen[i] > maxfa) {
    			maxfa = seqlen[i];
    			maxfaseq = a.clone();
    		}
    	}
    	for (int i = 0; i < n; i++) {
    		
    		seqfind(seqlen[i], i, k, a.clone());
    	}
    	
    }
    
    public static void seqfind(int seq, int index, int crem, int[] a) {
    	if (crem == 0 || index >= a.length) {
    		maxfa = seq;
    		maxfaseq = a.clone();
    	}
    	//for (int i = index)
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

