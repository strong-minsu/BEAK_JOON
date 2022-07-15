package dynamic_programming;
//Four Squares
import java.util.*;
import java.io.*;
public class p17626 {
	static int N;
	static int[] count = new int[50001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		count[0] = 0;
		count[1] = 1;		
		System.out.print(dp(N));
	}
	static int dp(int N) {
		for(int i=2; i<=N; i++) {
			int min = Integer.MAX_VALUE;
			//제곱해서 i까지.. 반복
			for(int j=1; j*j<=i; j++) {
				//i-(j*j)의 최소값은? 
				min = Math.min(min, count[i-(j*j)]);
			}
			count[i] = min+1;
		}
		return count[N];
	}
}
