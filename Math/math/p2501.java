package math;
import java.util.*;
public class p2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int r=0;
		int count=0;
		for(int i=1; i<=N; i++) {
			r = N%i;
			if(r==0) {
				count++;
			}
			if(count == K) {
				System.out.print(i);	
				break;
			}
			if(i==N && count < K) {
				System.out.print(0);
				break;
			}
		}
	}
}
