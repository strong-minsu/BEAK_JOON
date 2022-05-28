package math;
import java.util.*;

public class p1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Nnum = sc.nextInt();
		
		int A[] = new int[Nnum];
		for(int i=0; i<Nnum; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		long result= A[0]*A[Nnum-1];
		System.out.println(result);
	}
}
