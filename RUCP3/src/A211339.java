import java.io.*;
import java.util.*;

public class A211339 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int n1 = in.nextInt();
    	int n2 = in.nextInt();
    	if (n1 < 2 || n2 < 2) {
    		System.out.println("0");
    		return;
    	}
    	
    	char board[][] = new char[n1][n2];
    	
    	for (int i = 0; i < n1; i++){
    		String line = in.nextLine();
    		for (int j = 0; j < n2; j++){
    			board[i][j] = line.charAt(j);
    		}
    	}
    	char[] ref = {'a', 'c', 'e', 'f'};
    	int count = 0;
    	for (int i = 0; i < n1-1; i++){
    		char[] isFace = new char[4];
    		for (int j = 0; j < n2-1; j++){
    			isFace[0] = board[i][j];
    			isFace[1] = board[i+1][j];
    			isFace[2] = board[i][j+1];
    			isFace[3] = board[i+1][j+1];
    			Arrays.sort(isFace);
    			if (Arrays.equals(isFace, ref)){
    				count++;
    			}
    		}
    		
    	}
    	System.out.println(count);
    	
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

