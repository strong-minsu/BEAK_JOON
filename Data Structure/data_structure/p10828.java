package data_structure;
import java.util.*;
import java.io.*;
public class p10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>(); 

	/*push X: 정수 X를 스택에 넣는 연산이다.
	  pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	  size: 스택에 들어있는 정수의 개수를 출력한다.
	  empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	  top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/
		
		for(int i=0 ;i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				int num = Integer.parseInt(st.nextToken());	
				stack.push(num);
			}
			
			else if(str.equals("pop")) {
				if(stack.empty()) {
					System.out.println(-1);
				}
				else {
					int p = stack.pop();
					System.out.println(p);
				}
			}
			
			else if(str.equals("size")) {
				System.out.println(stack.size());
			}
			
			else if(str.equals("empty")) {
				if(stack.empty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			
			else if(str.equals("top")) {
				if(stack.empty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.peek());
				}
			}
		}
	}

}
