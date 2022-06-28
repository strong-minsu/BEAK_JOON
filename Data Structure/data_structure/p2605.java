package data_structure;
import java.util.*;
import java.io.*;

public class p2605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int num;
		for(int i=0; i<N; i++) {
			num = Integer.parseInt(st.nextToken());
			ll.add(i-num, i+1);
		}
		for(int i=0; i<N; i++) {
			sb.append(ll.get(i)).append(" ");
		}
		System.out.print(sb);
	}

}
