package data_structure;
import java.util.*;
import java.io.*;
//덱
public class p10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		Deque<Integer> deque = new LinkedList<>();
		
		/*push_front X: 정수 X를 덱의 앞에 넣는다.
		  push_back X: 정수 X를 덱의 뒤에 넣는다.
		  pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		  pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		  size: 덱에 들어있는 정수의 개수를 출력한다.
		  empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
		  front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		  back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/
		
		for(int i=0 ;i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push_front")) {
				int num = Integer.parseInt(st.nextToken());	
				deque.addFirst(num);
			}
			
			else if(str.equals("push_back")) {
				int num = Integer.parseInt(st.nextToken());	
				deque.addLast(num);
			}
			
			else if(str.equals("pop_front")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}
				else {
					int p = deque.pollFirst();
					System.out.println(p);
				}
			}
			
			else if(str.equals("pop_back")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}
				else {
					int p = deque.pollLast();
					System.out.println(p);
				}
			}
			
			else if(str.equals("size")) {
				System.out.println(deque.size());
			}
			
			else if(str.equals("empty")) {
				if(deque.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			
			else if(str.equals("front")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(deque.peekFirst());
				}
			}
			else if(str.equals("back")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(deque.peekLast());
				}
			}
		}
	}

}
