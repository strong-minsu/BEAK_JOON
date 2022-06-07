package implementation;
import java.util.*;
import java.io.*;

public class p11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		String answer = "<";
		
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		int count=0;
		while (!queue.isEmpty()) {
			count++;
			if(count == K) {
				//요소 삭제
				answer += queue.remove()+", ";
				count = 0;
			}else {
				//맨 앞을 빼고 뒤로 넣는다.
				queue.add(queue.remove());
			}
		}
		answer = answer.substring(0,answer.length()-2);
		answer += ">";
		
		System.out.print(answer);
	}

}
