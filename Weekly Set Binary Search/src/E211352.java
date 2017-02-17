import java.io.*;
import java.util.*;

public class E211352 {
	static class Tree {
		int location;
		int apples;
		public Tree(int l, int a) {
			location = l; apples = a;
		}
	}
	
	static class TreeComparator implements Comparator<Tree> {

		@Override
		public int compare(Tree o1, Tree o2) {
			return Integer.compare(o1.location, o2.location);
		}
		
	}
	
    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int n = in.nextInt();
    	ArrayList<Tree> neg_trees = new ArrayList<Tree>();
    	ArrayList<Tree> pos_trees = new ArrayList<Tree>();
    
    	for (int i = 0; i < n; i++) {
    		int pos = in.nextInt();
    		int num = in.nextInt();
    		if (pos < 0) {
    			neg_trees.add(new Tree(pos, num));
    		}
    		else {
    			pos_trees.add(new Tree(pos, num));
    		}
    	}
    	long totalApples = 0;
    	neg_trees.sort(new TreeComparator());
    	pos_trees.sort(new TreeComparator());
    	if (pos_trees.size() > neg_trees.size()) {
    		int i = 0;
    		int j = neg_trees.size() - 1;
    		while (j >= 0) {
    			totalApples += pos_trees.get(i).apples;
    			totalApples += neg_trees.get(j).apples;
    			i++;
    			j--;
    		}
    		totalApples+= pos_trees.get(i).apples;
    	}
    	if (pos_trees.size() < neg_trees.size()) {
    		int i = 0;
    		int j = neg_trees.size() - 1;
    		while (i < pos_trees.size()) {
    			totalApples += pos_trees.get(i).apples;
    			totalApples += neg_trees.get(j).apples;
    			i++;
    			j--;
    		}
    		totalApples+= neg_trees.get(j).apples;
    	}
    	if (pos_trees.size() == neg_trees.size()) {
    		int i = 0;
    		int j = neg_trees.size() - 1;
    		while (i < pos_trees.size()) {
    			totalApples += pos_trees.get(i).apples;
    			totalApples += neg_trees.get(j).apples;
    			i++;
    			j--;
    		}
    	}
    	out.println(totalApples);
    	
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

