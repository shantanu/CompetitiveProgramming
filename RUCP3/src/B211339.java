import java.io.*;
import java.util.*;

public class B211339 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	
    	int n = in.nextInt();
    	int i = n + 1;
    	while (true){
    		char[] num = Integer.toString(i).toCharArray();
    		if (findDuplicates(num)) {
    			System.out.println(i);
    			return;
    		}
    		i++;
    	}
    }
    
    public static boolean findDuplicates(char[] num) {
    	for (int j = 0; j < num.length - 1; j++) {
			for (int k = j+1; k < num.length; k++) {
				if (num[k] == num[j]) {
					return false;
				}
			}
		}
    	return true;
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

