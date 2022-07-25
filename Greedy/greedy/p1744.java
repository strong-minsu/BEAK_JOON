package greedy;
// 수 묶기
import java.util.*;
import java.io.*;
public class p1744 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		// 양수 우선순위 큐는 최대힙으로 생성
		PriorityQueue<Integer> plusPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		// 음수 우선순위 큐는 최소힙으로 생성
		PriorityQueue<Integer> minusPriorityQueue = new PriorityQueue<>();
		
		int numberOne = 0;	//1의 개수
		int numberZero = 0;	//0의 개수
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			// 0, 1은 개수만 저장
			//각각 0, 1, 양수, 음수 구별 후 저장
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
			//음수 우선순위 큐에 수가 남았을 경우
			if(numberZero==0)	//0이 없는 경우 음수를 더함
				sum += minusPriorityQueue.poll();
			else	//0이 있는 경우 (적을 필요 없지만, 절차 확인을 위해) 0을 더함
				sum += 0;
		}
		
		sum += numberOne;
		System.out.print(sum);
	}

}
