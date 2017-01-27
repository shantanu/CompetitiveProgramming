import java.util.*;
public class B598 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		String s = in.nextLine();
		int m = in.nextInt();
		for (int i = 0; i < m; i++){
			int l = in.nextInt();
			int r = in.nextInt();
			int k = in.nextInt();
			String toMod = s.substring(l-1, r);
			
			toMod = toMod.substring(toMod.length() - (k % toMod.length())) 
					+ toMod.substring(0, toMod.length() - (k % toMod.length()));
			
			s = s.substring(0, l-1) + toMod + s.substring(r);
		}
		System.out.println(s);
	}

}
