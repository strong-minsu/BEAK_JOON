package data_structure;
import java.util.*;
import java.io.*;
//��
public class p10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		Deque<Integer> deque = new LinkedList<>();
		
		/*push_front X: ���� X�� ���� �տ� �ִ´�.
		  push_back X: ���� X�� ���� �ڿ� �ִ´�.
		  pop_front: ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		  pop_back: ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		  size: ���� ����ִ� ������ ������ ����Ѵ�.
		  empty: ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
		  front: ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		  back: ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.*/
		
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
