package data_structure;
import java.util.*;
import java.io.*;

public class p10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(hmap.get(n) == null)
				hmap.put(n, 1);
			else
				hmap.put(n, hmap.get(n)+1);
		}
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			int m = Integer.parseInt(st.nextToken());
			if(hmap.get(m) == null) 
				sb.append(0).append(" ");
			else
				sb.append(hmap.get(m)).append(" ");
		}
		System.out.println(sb);
		
	}

}
