import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int num=0,so = 0,tmp=0;
        
        for(int i=0; i<N; i++){ // 몇개 비교할건지
            num = in.nextInt(); //숫자 하나씩 입력받기
            
            if(num==1) //1일경우 위로
            	continue;
            for(int j=2;j<num;j++) { 
            	if((num%j)==0) { //소수 아닐경우
            		tmp=1; 
            		break;
            	}
            }
            if(tmp==0) { //소수
            	so++;
            }
            tmp=0;
        }
        System.out.println(so);
    }
}