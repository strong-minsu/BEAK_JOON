package data_structure;
import java.util.*;
import java.io.*;
public class p10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>(); 

	/*push X: ���� X�� ���ÿ� �ִ� �����̴�.
	  pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	  size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
	  empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
	  top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.*/
		
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
