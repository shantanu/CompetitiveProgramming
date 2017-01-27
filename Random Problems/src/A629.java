import java.io.*;
import java.util.*;

public class A629 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int n = in.nextInt();
    	char[][] board = new char [n][n];
    	for (int i =0; i < n; i++){
    		String line = in.next();
    		for (int j = 0; j < n; j++){
    			board[i][j] = line.charAt(j);
    		}
    	}
    	// Count c's in rows
    	int pairs = 0; 
    	for (int i = 0; i < n; i++){
    		int cs = 0;
    		for (int j = 0; j < n; j++){
    			if (board[i][j] == 'C'){
    				cs++;
    			}
    		}
    		pairs += cs*(cs-1)/2;
    	}
    	
    	//Count c's in columns
    	for (int j = 0; j < n; j++){
    		int cs = 0;
    		for (int i = 0; i < n; i++){
    			if (board[i][j] == 'C'){
    				cs++;
    			}
    		}
    		pairs += cs*(cs-1)/2;
    	}
    	out.print(pairs);
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
