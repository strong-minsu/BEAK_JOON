package bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int []n = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		int bj=0;
		int temp=0;
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					temp = n[i]+n[j]+n[k];
					if(bj<temp &&temp<=M)
						bj = temp;
				}
			}
		}
		System.out.print(bj);
	}

}
