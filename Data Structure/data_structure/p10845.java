package data_structure;
import java.util.*;
import java.io.*;
//ť
public class p10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		
		/*push X: ���� X�� ť�� �ִ� �����̴�.
		  pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		  size: ť�� ����ִ� ������ ������ ����Ѵ�.
		  empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
		  front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		  back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.*/
		
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
