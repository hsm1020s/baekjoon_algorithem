import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class Main {

	public static void main(String[] args) {	
		int n=0;
		int[] m;
		int min=1000001,max=-1000001;
		Scanner in =new Scanner(System.in);
		
		n= in.nextInt();
		m= new int[n];		
		for(int i=0; i<m.length; i++) 
			m[i]= in.nextInt();
		
		for(int i=0;i<m.length; i++) {
			if(max<m[i]) max=m[i];
			if(min>m[i]) min=m[i];
		}		
		System.out.println(min+" "+max);
	}
}
 