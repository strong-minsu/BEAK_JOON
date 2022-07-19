package dynamic_programming;
import java.util.*;
import java.io.*;
// 2*n Å¸ÀÏ¸µ
public class p11726 {
	static int N;
	static int [] number = new int[1001];;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		number[1] = 1;
		number[2] = 2;
		System.out.print(dp(N));
	}
	static int dp(int n) {
		if(n>2) {
			for(int i=3; i<=n; i++) {
			number[i] = (number[i-1]+number[i-2])%10007;
			}
		}
		return number[n];
	}
}
