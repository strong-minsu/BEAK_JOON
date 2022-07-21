package data_structure;
//ÃÖ¼Ò Èü
import java.util.*;
import java.io.*;
public class p1927 {
	static int N;
	static int x;
	static PriorityQueue<Integer> queue = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N =Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			x = Integer.parseInt(br.readLine());
			if(x == 0) {
				if(queue.size() == 0) {
					sb.append(0).append("\n");
				}
				else {
					sb.append(queue.poll()).append("\n");
				}
			}
			else {
				queue.add(x);
			}
		}
		System.out.print(sb);
	}

}
