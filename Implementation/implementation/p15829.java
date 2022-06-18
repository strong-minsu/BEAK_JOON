package implementation;
import java.util.*;
import java.io.*;

public class p15829 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		
		// (a*31^0 +b*31^1 ...) %1234567891

		long r = 1;
		long sum = 0;
		for(int i=0; i<N; i++) {
			sum += ((s.charAt(i) - 96)*r);
			r = (r*31)%1234567891;
		}
		sb.append(sum%1234567891);
		System.out.print(sb);
	}
}
