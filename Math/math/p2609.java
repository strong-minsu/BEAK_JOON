package math;
import java.util.*;
import java.io.*;

public class p2609 {
	//최대공약수
	public static int GCD(int a, int b) {
		int result=0;
		if(b == 0) {
			result = a;
			return result;
		}
		else
			return GCD(b, a%b);
		
	}
	
	//최소공배수
	public static long LCM(int a, int b) {
		long result;
		result = (a * b) / GCD(a, b);
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stTokenizer = 
				new StringTokenizer(bfReader.readLine());
		
		int A = Integer.parseInt(stTokenizer.nextToken());
		int B = Integer.parseInt(stTokenizer.nextToken());
		
		int max, min;
		max = Math.max(A, B);
		min = Math.min(A, B);
		
		int gcd = GCD(max, min);
		long lcm = LCM(max, min);
		System.out.println(gcd);
		System.out.println(lcm);

		
	}
}
