package math;
import java.util.*;
import java.io.*;
//다리놓기
public class p1010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder(); 
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			long N = Long.parseLong(st.nextToken());
			long M = Long.parseLong(st.nextToken());
			
			long result=1;
			//NCM 조합을 이용함
			for(int j=0; j<N; j++) {
				result *= (M-j);
				result /= (j+1);
			}
			sb.append(result).append("\n");
		}
		System.out.print(sb);
	}
}
