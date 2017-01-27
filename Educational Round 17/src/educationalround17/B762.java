package educationalround17;

import java.util.ArrayList;
import java.util.Scanner;

public class B762 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in); 
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int m = in.nextInt();
		
		ArrayList<Integer> usb = new ArrayList();
		ArrayList<Integer> ps2 = new ArrayList();
		
		for (int i = 0; i < m; i++){
			int val = in.nextInt();
			String type = in.next();
			if (type.equals("USB")){
				usb.add(val);
			}
			else
				ps2.add(val);
		}
		
		usb.sort(null);
		ps2.sort(null);
		long totalCost = 0;
		int computers = 0;
		while (!usb.isEmpty() || !ps2.isEmpty()){
			//no computers left
			if (a == 0 && b == 0 && c == 0){
				break;
			}
			
			if (!usb.isEmpty() && !ps2.isEmpty()){
				if (usb.get(0) < ps2.get(0)){
					if (a>0){
						a--;
						totalCost+=usb.remove(0);
						computers++;
						continue;
					}
					else if (c > 0) {
						c--;
						totalCost += usb.remove(0);
						computers++;
						continue;
					}
				}
				if (usb.get(0) > ps2.get(0)){
					if (b>0){
						b--;
						totalCost+= ps2.remove(0);
						computers++;
						continue;
					}
					else if (c > 0) {
						c--;
						totalCost += ps2.remove(0);
						computers++;
						continue;
					}
				}
			}
			
			if (!usb.isEmpty()) {
				if (a == 0 && c == 0) break;
				else {
					if (a>0){
						a--;
						totalCost+=usb.remove(0);
						computers++;
						continue;
					}
					else if (c > 0) {
						c--;
						totalCost += usb.remove(0);
						computers++;
						continue;
					}
				}
			}
			if (!ps2.isEmpty()) {
				if (b == 0 && c == 0) break;
				else {
					if (b>0){
						b--;
						totalCost+=ps2.remove(0);
						computers++;
						continue;
					}
					else if (c > 0) {
						c--;
						totalCost += ps2.remove(0);
						computers++;
						continue;
					}
				}
			}
		}
		System.out.println(computers + " " + totalCost);
	}

}
