import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class Main {

	public static void main(String[] args) {
		
		int max=0,check=0;
		int[] su = new int[9];
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<9;i++) {
			su[i]=in.nextInt();
			if(max<su[i]) {
				max=su[i];
				check=i+1;
			}
		}
		System.out.println(max);
		System.out.println(check);
	}
}
 