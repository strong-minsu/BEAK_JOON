package math;
import java.util.*;
//average
public class p1546 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		double S[] = new double[N];
		double M = 0;
		double sum = 0;
		for (int i=0; i<N; i++) {
			S[i] = scanner.nextInt();
		}
		
		//select most big number
		for (int i=0; i<N; i++) {
			if(M < S[i])
				M = S[i];
		}
		for (int i=0; i<N; i++) {
			S[i] = (S[i]/M) * 100;
		}
		for (int i=0; i<N; i++) {
			sum = sum+S[i];
		}
		System.out.print(sum/N);
	}
}
