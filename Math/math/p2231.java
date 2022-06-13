package math;
import java.util.*;
import java.io.*;

public class p2231 {
	public static int d(int n) {
		int sum = n;
		while(n>0) {
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int self = 0;
		for(int i=1; i<N; i++) {
			if(d(i) == N) {
				self = i;
				break;
			}
		}
		System.out.print(self);
	}

}
