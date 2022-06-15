package math;
import java.util.*;
public class p2355 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		
		long max = Math.max(A,B);
		long min = Math.min(A, B);
		
		long sum = ((max*(max+1)/2)-(min*(min-1)/2));
		
		System.out.print(sum);
	}
}
