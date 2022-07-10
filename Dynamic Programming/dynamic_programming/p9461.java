package dynamic_programming;
//파도반 수열
// dp[n] = dp[n-5] + dp[n-1] = dp[n-3]+ dp[n-2]
import java.util.*;
import java.io.*;
public class p9461 {
	static long [] P = new long[101];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		P[1] = 1;
		P[2] = 1;
		P[3] = 1;
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(dp(N)).append("\n");
		}
		System.out.print(sb);
	}
	static long dp(long N) {
		for(int i=4; i<=N; i++) {
			if(P[i]==0) {
				P[i] = dp(i-3) +dp(i-2);
			}
		}
		return P[(int)N];
	}
}
