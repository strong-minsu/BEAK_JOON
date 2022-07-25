package greedy;
//카드 정렬하기 
import java.util.*;
import java.io.*;
public class p1715 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Long> queue = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
		
		//우선 순위 큐에 넣어준다. (최소힙)
		for(int i=0; i<N; i++) {
			Long num = Long.parseLong(br.readLine());
			queue.add(num);
		}
		
		long count =0;
		//큐 사이즈가 1일 때까지 반복
		while(queue.size() > 1) {
			// 가장 작은 수 2개 추출후 더함
			long n1 = queue.poll();
			long n2 = queue.poll();
			//카운트 증가
			count += n1+n2;
			//큐에 다시 넣음
			queue.add(n1+n2);
		}		
		System.out.print(count);
	}

}
