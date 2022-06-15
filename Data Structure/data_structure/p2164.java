package data_structure;
import java.util.*;
import java.io.*;

public class p2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		Queue<Integer> que = new LinkedList<>();
		
		for(int i=1; i<N+1;i++) {
			que.add(i);
		}
		//System.out.print(deque);
		
		while(que.size() >1) {
			que.remove();
			que.add(que.remove());
			
		}
		System.out.print(que.remove());
	}

}
