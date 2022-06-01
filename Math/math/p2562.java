package math;
import java.util.*;
public class p2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[10];
		int result = 0;
		int num=0;
		for(int i=1; i<A.length;i++) {
			A[i] = sc.nextInt();
			if(result < A[i]) {
				result = A[i];
				num = i;
			} 
		}
		System.out.println(result);
		System.out.println(num);

	}

}
