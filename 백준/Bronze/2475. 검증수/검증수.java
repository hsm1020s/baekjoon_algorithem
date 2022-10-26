import java.util.*;
public class Main {

	public static void main(String[] args) {
		// 5자리 00000~99999 6자리는 검증수 
		// 5자리에 들어가는 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
		Scanner in= new Scanner(System.in);
		int sum = 0;
		int su=0;
		for(int i=0;i<5;i++) {
			su =in.nextInt();
			sum+= (su*su);
		}
		System.out.println(sum%10);
		
	}
}