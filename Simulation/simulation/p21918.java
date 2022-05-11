package simulation;

import java.io.*;
import java.util.*;

public class p21918 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int a,b,c;
		//전구가 들어갈 배열
		st = new StringTokenizer(br.readLine());
		int B[] = new int[N];
		for(int i=0;i<N;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println();
		
		for (int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if(a == 1) {
				B[b-1] = c;
			}
			else {
				for(int j=b-1;j<c;j++) {
					if(a == 2) {
						if(B[j]==1)
							B[j] = 0;
						else
							B[j] = 1;
					}
					else if(a == 3) {
						B[j] = 0;
					}
					else
						B[j] = 1;
				}
			}
			
		}
		for(int i=0;i<N;i++) {
			System.out.print(B[i]+" ");
		}
	}
}
