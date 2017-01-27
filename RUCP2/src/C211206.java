import java.util.*;
public class C211206 {
	public static void main (String args[]){
		Scanner in = new Scanner (System.in);
		char[] s = in.nextLine().toCharArray();
		int kr = 0;
		int kb = 0;
		int ky = 0;
		int kg = 0;
		
		
		for (int i = 1; i < s.length-5; i++){
			if (s[i+3] == '!') {
				boolean hasR = false;
				boolean hasG = false;
				boolean hasY = false;
				boolean hasB = false;
				
				for (int j = i; j < i+4; j++){
					if(s[j] == 'R') hasR = true;
					if(s[j] == 'G') hasG = true;
					if(s[j] == 'Y') hasY = true;
					if(s[j] == 'B') hasB = true;
				}
					
				if(!hasR){ s[i+3] = 'R'; kr++;}
				if(!hasG){ s[i+3] = 'G'; kg++;}
				if(!hasY){ s[i+3] = 'Y'; ky++;}
				if(!hasB){ s[i+3] = 'B'; kb++;}
				
			}
		}
	}
}
