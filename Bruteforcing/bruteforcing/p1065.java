package bruteforcing;
import java.util.*;

public class p1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int f, s, t;
		int count=0;
		
		if(N<100) {
			System.out.print(N);
		}
		
		else {
			count = 99;
			for(int i=100;i<=N;i++) {
				f = i/100; //100�� �ڸ�
				t = i%10; //1�� �ڸ�
				s = (i%100)/10;
				if((f-s)==(s-t)) //10�� �ڸ�
					count++;
			}
			System.out.print(count);
		}
	}
}
