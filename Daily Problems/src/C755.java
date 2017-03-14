import java.io.*;
import java.util.*;

public class C755 {
	
	static class DisjointSet {
		int count;
		int[] parent;
		public DisjointSet (int count) {
			this.count = count;
			this.parent = new int[count];
			
			for (int i = 0; i < count; i++) {
				parent[i] = i;
			}
		}
		
		public int find (int i) {
			if (parent[i] == i) return i;
			else {
				int res = find(parent[i]);
				parent[i] = res;
				return res;
			}
		}
		
		public void union (int i, int j) {
			int irep = find(i);
			int jrep = find(j);
			parent[irep] = jrep;
		}
	}
	
    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int n = in.nextInt();
    	DisjointSet ds = new DisjointSet(n+1);
    	for (int i = 1; i <= n; i++) {
    		int p = in.nextInt();
    		//ds.parent[i] = p;
    		ds.union(i, p);
    	}
    	ArrayList<Integer> used = new ArrayList<Integer>();
    	for (int i = 1; i <= n; i++) {
    		int treenum = ds.find(i);
    		if (!used.contains(treenum)) {
    			used.add(treenum);
    			//System.out.println(treenum);
    		}
    	}
    	System.out.println(used.size());
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

