package sorting;
import java.io.*;
import java.util.*;
public class p11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int [][] xy = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			xy[i][1] = Integer.parseInt(st.nextToken());
			xy[i][0] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(xy, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
		    	 if(o1[0] == o2[0]) {
	                 return o1[1] - o2[1];
		    	 }
		    	 else {
		    		 return o1[0] - o2[0]; 
		    	 }
	          }
		});
		
		for(int i=0; i<N; i++) {
			sb.append(xy[i][1]).append(" ").append(xy[i][0]).append("\n");
		}
		System.out.print(sb);
	}

}
