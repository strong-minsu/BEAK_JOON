package math;
import java.util.*;
public class p2839 {
	public static void main(String[] args) {
		int k5 = 5;
		int k3 = 3;
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count=0;
		
		while(true) {
			if(N ==0)
				break;
			
			if(N<0) {
				count = -1;
				break;
			}
			if(N%5==0) {
				count = count+N/5;
				break;
			}
			if(N>5 && N%3!=0) {
				N = N-5;
				count++;
			}
			else {
				N = N-3;
				count++;
			}
		}
		if(count != 0)
			System.out.print(count);
	}
}
