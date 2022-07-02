package data_structure;
import java.util.*;
import java.io.*;
public class p2161 {
	public static void main(String[] agrs) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<N+1; i++) {
			queue.add(i);
		}
		while(!queue.isEmpty()) {
			sb.append(queue.remove()).append(" ");
			
			if(!queue.isEmpty())
				queue.add(queue.remove());
		}
		System.out.print(sb);
	}
}
