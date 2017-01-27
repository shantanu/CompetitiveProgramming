package Round390;

import java.io.*;
import java.util.*;

public class B754 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        char[][] board = new char[4][4];
        for (int i = 0; i < 4; i++){
        	String line = in.nextLine();
        	for (int j = 0; j < 4; j++){
        		board[i][j] = line.charAt(j);
        	}
        }
        
        for (int i = 0; i < 4; i++){
        	for (int j = 0; j < 4; j++){
        		//If you fill in each of those spots, does it work
        		
        		if (board[i][j] == '.'){
        			board[i][j] = 'x';
        		}
        		else {
        			continue;
        		}
        		
        		//check vertical
        		int count = 0;
        		for (int k = i-2; k <= i+2; k++){
        			if (k >= 0 && k < 4){
        				if (board[k][j] == 'x'){
        					count++;
        					if (count >= 3){
        						out.println("YES");
        						return;
        					}
        				}
        				else{
        					count = 0;
        				}
        			}
        		}
        		if (count >= 3){
        			out.println("YES");
        			return;
        		}
        		else count = 0;
        		
        		//check horizontal
        		for (int k = j-2; k <= j+2; k++){
        			if (k >= 0 && k < 4){
        				if (board[i][k] == 'x'){
        					count++;
        					if (count >= 3){
        						out.println("YES");
        						return;
        					}
        				}
        				else{
        					count = 0;
        				}
        			}
        		}
        		
        		count = 0;
        		
        		//check diagonal downwards slanting
        		for (int k = -2; k <= 2; k++){
        			if (i + k >= 0 && i + k < 4 && j + k >= 0 && j + k < 4){
        				if (board[i+k][j+k] == 'x'){
        					count++;
        					if (count >= 3){
        						out.println("YES");
        						return;
        					}
        				}
        				else{
        					count = 0;
        				}
        			}
        		}
        		if (count >= 3){
        			out.println("YES");
        			return;
        		}
        		else count = 0;
        		
        		//check diagonal upwards sloping
        		for (int k = -2; k <= 2; k++){
        			if (i + k >= 0 && i + k < 4 && j - k >= 0 && j - k < 4){
        				if (board[i+k][j-k] == 'x'){
        					count++;
        					if (count >= 3){
        						out.println("YES");
        						return;
        					}
        				}
        				else{
        					count = 0;
        				}
        			}
        		}
        		if (count >= 3){
        			out.println("YES");
        			return;
        		}
        		else count = 0;
        		
        		
        		
        		
        		
        		board[i][j] = '.';
        	}
        	
        }
        out.println("NO");
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

