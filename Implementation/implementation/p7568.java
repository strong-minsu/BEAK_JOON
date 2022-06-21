package implementation;
import java.util.*;
import java.io.*;
public class p7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int [][]P = new int[N][3];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			P[i][0] = Integer.parseInt(st.nextToken());
			P[i][1] = Integer.parseInt(st.nextToken());
			P[i][2] = 1; 
		}
		


		for(int i=0; i<N; i++) {
			int count = 1;
			for(int j=0; j<N; j++) {
				if(P[i][0] < P[j][0] && P[i][1] < P[j][1]) {
					count++;
				}
				/*else if(P[i][0] < P[j][0] && P[i][1] == P[j][1]) {
					count++;
				}
				
				else if(P[i][0] == P[j][0] && P[i][1] < P[j][1]) {
					count++;
				}*/
			}
			
			P[i][2] = count;
		}
		
		for(int i=0; i<N; i++) {
			sb.append(P[i][2]).append(" "); 
		}
		System.out.print(sb);
	}

}
