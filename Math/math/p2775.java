package math;
import java.util.*;
import java.io.*;

public class p2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		int k = 0;
		int n = 0;
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			int [][] ap = new int[k+1][n+1];
			for(int j=1; j<n+1; j++) {
				ap[0][j]= j;
			}
			for(int j=1; j<k+1; j++) {
				for(int l=1; l<n+1; l++) {
					if(l == 1) {
						ap[j][l] = 1;
					}
					else {
						ap[j][l] = ap[j][l-1]+ap[j-1][l];
					}
				}
			}
			sb.append(ap[k][n]).append("\n");
		}
		System.out.print(sb);
	}
}
