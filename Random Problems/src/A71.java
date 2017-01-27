import java.io.*;
import java.util.*;

public class A71 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
        	String s = in.nextLine().trim();
        	if (s.length() > 10) {
        		out.printf("%c%d%c\n", s.charAt(0), s.length()-2, s.charAt(s.length()-1));
        		/*StringBuilder abbr = new StringBuilder();
        		abbr.append(s.charAt(0));
        		abbr.append(s.length()-2);
        		abbr.append(s.charAt(s.length()-1));
        		out.println(abbr.toString());*/
        	}
        	else {
        		out.println(s);
        	}
        }
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
