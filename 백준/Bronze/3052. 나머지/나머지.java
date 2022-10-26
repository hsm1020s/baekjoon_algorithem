import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class Main {

	public static void main(String[] args) {	
		int count=10;
		int[][] arr = new int[2][10];
		Scanner in = new Scanner(System.in);
		
		
		
		for(int i=0;i<10;i++) {
			arr[0][i]=in.nextInt();
			arr[1][i] = arr[0][i] % 42;
		}
		for(int i=0;i<9;i++) {//     0 1 2 3 4 5 7 8 9
			for(int j=i+1;j<10;j++) { // 1~9 2~9 3~9 ...
				if(arr[1][i]==arr[1][j]) {  //0 1 
					count-=1;
					break;
				}
			}
		}
		System.out.println(count);
	}
}