import java.io.*;
import java.util.*;

public class A588 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        int n = in.nextInt();
        int[] a = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
        	a[i] = in.nextInt();
        	p[i] = in.nextInt();
        }
        
        int money = 0;
        /*int i = 0;
        while (i < n) {
        	int currentPrice = p[i];
        	int buyAtPrice = 0;
        	
        	while (i < n && p[i] >= currentPrice) {
        		buyAtPrice += a[i];
        		i++;
        	}
        	money += buyAtPrice*currentPrice;
        }*/
        
        int price = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
        	price = Math.min(price, p[i]);
        	money += price*a[i];
        }
        
        out.print(money);
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
