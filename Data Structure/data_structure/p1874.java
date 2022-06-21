package data_structure;
import java.util.*;
import java.io.*;

public class p1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();		
		Stack<Integer> array = new Stack<>();		

		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			stack.push(n);
		}
		
		for(int i = 0; i < N; i++) {
			array.push(stack.pop());
			//stack.pop();
		}
		
		for(int i = 1; i <= N; i++) {
			if(i <= array.peek()) {
				stack.push(i);
				sb.append("+\n");
			}
			while(stack.size() > 0 && stack.peek().equals(array.peek())) {
				stack.pop();
				array.pop();
				sb.append("-\n");
			}
		}
		if(array.size() > 0)
			sb = new StringBuilder("NO");
		
		System.out.print(sb);
	}

}
