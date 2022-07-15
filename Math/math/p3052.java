package math;
import java.util.*;
import java.io.*;
public class p3052 {
	static int N;
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<10; i++) {
			N = Integer.parseInt(br.readLine());
			int re = N % 42;
			if(!stack.contains(re)) {
				stack.push(re);
			}
		}
		System.out.print(stack.size());

	}

}
