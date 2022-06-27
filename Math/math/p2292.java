package math;
import java.util.*;
import java.io.*;

public class p2292 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		long N = Integer.parseInt(br.readLine());
		long i=1;
		long count = 1;
		
		while(count < N) {
			count += 6*i;
			i++;
		}
		if(N == 1)
			sb.append(1);
		else {
			sb.append(i);
		}
		System.out.print(sb);
	}
}
