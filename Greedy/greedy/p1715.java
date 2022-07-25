package greedy;
//ī�� �����ϱ� 
import java.util.*;
import java.io.*;
public class p1715 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Long> queue = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
		
		//�켱 ���� ť�� �־��ش�. (�ּ���)
		for(int i=0; i<N; i++) {
			Long num = Long.parseLong(br.readLine());
			queue.add(num);
		}
		
		long count =0;
		//ť ����� 1�� ������ �ݺ�
		while(queue.size() > 1) {
			// ���� ���� �� 2�� ������ ����
			long n1 = queue.poll();
			long n2 = queue.poll();
			//ī��Ʈ ����
			count += n1+n2;
			//ť�� �ٽ� ����
			queue.add(n1+n2);
		}		
		System.out.print(count);
	}

}
