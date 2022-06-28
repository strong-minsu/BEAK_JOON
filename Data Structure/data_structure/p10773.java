package data_structure;
import java.util.*;
import java.io.*;

public class p10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>(); 
		
		int K = Integer.parseInt(st.nextToken());
		int n;
		int sum=0;
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			if(n == 0) {
				stack.pop();
			}
			else {
				stack.push(n);
			}
		}
		while(!stack.isEmpty()) {
			sum+=stack.pop();
		}
		sb.append(sum);
		System.out.print(sb);
	}

}
