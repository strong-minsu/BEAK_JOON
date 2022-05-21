package math;
import java.util.*;

public class p2581 {
	static boolean primenumber(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2 ; i<n ; i++ ) {
			if(n%i==0) {
				return false;
			}
		}
		return true;	
	}
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int min = 0;
		int c = 0;
		
		for(int i=M;i<=N;i++) {
			if(primenumber(i)) {
				c++;
				sum = sum+i;
				if(c==1)
					min = i;
			}
			if(i == N) {
				if(min==0) {
					System.out.println(-1);
					break;
				}
				System.out.println(sum);
				System.out.print(min);
			}
		}
	}
}
