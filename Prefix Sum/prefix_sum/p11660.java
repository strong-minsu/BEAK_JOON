package prefix_sum;

import java.io.*;
import java.util.*;

public class p11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stTokenizer = 
				new StringTokenizer(bfReader.readLine());
		int x1, x2, y1, y2;
		//수의 개수
		int N = Integer.parseInt(stTokenizer.nextToken());
		//합 구해야하는 횟수
		int M = Integer.parseInt(stTokenizer.nextToken());
		
		int result[] = new int[M];

		
		int A[][] = new int[N+1][N+1];
		int S[][] = new int[N+1][N+1];
		
		for(int i=1; i<N+1; i++) {
			stTokenizer = 
					new StringTokenizer(bfReader.readLine());
			for(int j=1; j<N+1; j++) {
				A[i][j] = Integer.parseInt(stTokenizer.nextToken());
			}
		}
		
		for(int k=1; k<N+1; k++) {
			for(int l=1; l<N+1; l++) {
				S[k][l] = S[k][l-1] + S[k-1][l] - S[k-1][l-1] + A[k][l]; 
			}
		}
		
		for(int i=0; i<M; i++) {
			stTokenizer = 
					new StringTokenizer(bfReader.readLine());
			x1 = Integer.parseInt(stTokenizer.nextToken());
			y1 = Integer.parseInt(stTokenizer.nextToken());
			x2 = Integer.parseInt(stTokenizer.nextToken());
			y2 = Integer.parseInt(stTokenizer.nextToken());
			
			result[i] = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];
			
		}
		for(int i=0; i<M; i++) {
			System.out.println(result[i]);
		}
	}
}
