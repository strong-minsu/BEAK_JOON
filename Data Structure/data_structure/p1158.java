package data_structure;
import java.util.*;
import java.io.*;
public class p1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		sb.append("<");
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<N+1; i++) {
			queue.add(i);
		}
		int r ;
		int count = 1; 
		while(!queue.isEmpty()) {
			if(count == K) {
				r = queue.remove();
				if(queue.isEmpty()) {
					sb.append(r).append(">");
				}
				else {
					sb.append(r).append(", ");
				}
				count=1;
			}
			else {
				r = queue.remove();
				queue.add(r);
				count++;
			}
		}
		System.out.print(sb);
	}

}
