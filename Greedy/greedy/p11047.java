package greedy;
import java.util.*;
public class p11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int count = 0;
		
		int [] N_array = new int[N];
		for(int i=0; i<N; i++) {
			N_array[i] = sc.nextInt();
		}
		
		int n = N_array.length-1;
		
		while(K!=0) {
			if(N_array[n] <= K) {
				K = K-N_array[n];
				count++;
			}
			else
				n--;
		}
		System.out.print(count);
	}

}
