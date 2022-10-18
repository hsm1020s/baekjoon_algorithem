import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=0,sum=0;
		n= in.nextInt();
		if(1<=n && n<=10000) {
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
		}
		System.out.println(sum);
}
}