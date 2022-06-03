package data_structure;
import java.util.*;
import java.io.*;
//큐
public class p10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		
		/*push X: 정수 X를 큐에 넣는 연산이다.
		  pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		  size: 큐에 들어있는 정수의 개수를 출력한다.
		  empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
		  front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		  back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/
		
		int last=0;
		for(int i=0 ;i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				int num = Integer.parseInt(st.nextToken());	
				last = num;
				queue.add(num);
			}
			
			else if(str.equals("pop")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				}
				else {
					int p = queue.remove();
					System.out.println(p);
				}
			}
			
			else if(str.equals("size")) {
				System.out.println(queue.size());
			}
			
			else if(str.equals("empty")) {
				if(queue.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			
			else if(str.equals("front")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(queue.peek());
				}
			}
			else if(str.equals("back")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(last);
				}
			}
		}
		
	}
}
