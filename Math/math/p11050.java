package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11050 {
	
	public static long fatorial(int n) {
		long ans = 1;
		for(int i=n; i>0; i--) {
			ans = i*ans;
		}
		return ans;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		long n = fatorial(N);
		long k = fatorial(K);
		long n_k = fatorial(N-K);
		
		long answer = n/(k*n_k);
		System.out.print(answer);


	}
}
