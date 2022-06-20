package math;
import java.util.*;
import java.io.*;

public class p2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int count=0;
		
		count = (V-A)/(A-B);
		count++;
		if((V-A)%(A-B) !=0)
			count++;
			
		sb.append(count);
		
		System.out.print(sb);
		
	}

}
