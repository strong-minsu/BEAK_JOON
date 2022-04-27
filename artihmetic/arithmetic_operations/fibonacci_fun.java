package arithmetic_operations;
import java.util.*;
import java.io.*;
public class fibonacci_fun {
	static int count_0 ;
	static int count_1;
	static int count_0_add_1;
	
	public static void fibonacci_count(int n) {
		count_0 = 1;
		count_1 = 0;
		count_0_add_1 = 1;
		for (int i=0; i<n ;i++) {
			count_0 = count_1;
			count_1 = count_0_add_1;
			count_0_add_1 = count_0 + count_1;
			
		}
	}
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int S = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < S; i++) {
			int N = Integer.parseInt(br.readLine());
			fibonacci_count(N);			
			sb.append(count_0).append(' ').append(count_1).append('\n');
		}
		System.out.println(sb);
 
	}
}
