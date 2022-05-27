package math;
import java.util.*;
//제공하는 API가 있는 걸 알았나요.? no 
//^^ 
//import java.math.BigInteger; // 큰수 입력 받는 API

public class p10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//BigInteger A = sc.nextBigInteger();
		//BigInteger B = sc.nextBigInteger();
		//A = A.add(B);
		//System.out.print(A);
		
		String A = sc.next();
		String B = sc.next();
		
		
		int max_l = Math.max(A.length(), B.length());
		int a[] = new int[max_l+1];
		int b[] = new int[max_l+1];
		int c[] = new int[max_l+1];
		
		for(int i=A.length()-1, idx=0; i>-1; i--, idx++) {
			a[idx] = A.charAt(i) -'0';
		}
		for(int i=B.length()-1, idx=0; i>-1; i--, idx++) {
			b[idx] = B.charAt(i) - '0';
		}
		
		for(int i = 0; i < max_l; i++) {
			int value = a[i] + b[i];
			a[i] = value % 10;		
			a[i + 1] += (value/10);	
		}
		
		StringBuilder sb = new StringBuilder();
		
		if(a[max_l] != 0) {
			sb.append(a[max_l]);
		}
		for(int i = max_l - 1; i >= 0; i--) {
			sb.append(a[i]);
		}
		
		System.out.println(sb);
	}
}
