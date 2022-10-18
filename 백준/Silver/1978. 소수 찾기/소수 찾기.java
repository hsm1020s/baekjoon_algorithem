import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int num=0,so = 0,tmp=0;
        
        for(int i=0; i<N; i++){ // 몇개 비교할건지
            num = in.nextInt(); 
            
            if(num==1)
            	continue;
            for(int j=2;j<num;j++) {
            	if((num%j)==0) {
            		tmp=1;
            		break;
            	}
            }
            if(tmp==0) {
            	so++;
            }
            tmp=0;
        }
        System.out.println(so);
    }
}