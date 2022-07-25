package greedy;
// �� ����
import java.util.*;
import java.io.*;
public class p1744 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		// ��� �켱���� ť�� �ִ������� ����
		PriorityQueue<Integer> plusPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		// ���� �켱���� ť�� �ּ������� ����
		PriorityQueue<Integer> minusPriorityQueue = new PriorityQueue<>();
		
		int numberOne = 0;	//1�� ����
		int numberZero = 0;	//0�� ����
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			// 0, 1�� ������ ����
			//���� 0, 1, ���, ���� ���� �� ����
			int num = Integer.parseInt(br.readLine());
			if(num > 1) {
				plusPriorityQueue.add(num);
			}
			else if(num < 0) {
				minusPriorityQueue.add(num);
			}
			else if(num == 1) {
				numberOne++;
			}
			else {
				numberZero++;
			}
		}
		
		int num1, num2;
		while(plusPriorityQueue.size() > 1) {
			num1 = plusPriorityQueue.poll();
			num2 = plusPriorityQueue.poll();
			
			sum += (num1*num2);
		}
		if(!plusPriorityQueue.isEmpty()) {
			sum += plusPriorityQueue.poll();
		}
		
		while(minusPriorityQueue.size() > 1) {
			num1 = minusPriorityQueue.poll();
			num2 = minusPriorityQueue.poll();
			
			sum+= (num1*num2);
		}
		if(!minusPriorityQueue.isEmpty()) {
			//���� �켱���� ť�� ���� ������ ���
			if(numberZero==0)	//0�� ���� ��� ������ ����
				sum += minusPriorityQueue.poll();
			else	//0�� �ִ� ��� (���� �ʿ� ������, ���� Ȯ���� ����) 0�� ����
				sum += 0;
		}
		
		sum += numberOne;
		System.out.print(sum);
	}

}
