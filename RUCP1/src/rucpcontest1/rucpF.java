package rucpcontest1;

import java.io.*;
import java.util.*;

public class rucpF {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        double factorial[] = {1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};
        String a = in.nextLine();
        String b = in.nextLine();
        
        int needs = 0;
        for (int i = 0; i < a.length(); i++){
        	char x = a.charAt(i);
        	if (x == '+'){
        		needs++;
        	}
        	else if (x == '-') {
        		needs--;
        	}
        }
        int pos = 0;
        int numQuestion = 0;
        for (int i = 0; i < b.length(); i++){
        	char x = b.charAt(i);
        	if (x == '+') pos++;
        	else if (x == '-') pos--;
        	else if (x == '?') numQuestion++;
        }
        
        if (Math.abs(needs - pos) > numQuestion){
        	out.println(0);
        	return;
        }
        
        int sum = needs - pos;
        int possibilites = 0;
        int work = 0;
        
        //out.println(())/(factorial[numQuestion+1]));
        
        
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

