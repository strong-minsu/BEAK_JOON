package sorting;
import java.util.*;
import java.io.*;

public class p1940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		int [] N_num = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N_num.length; i++) {
			N_num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(N_num);
		
		//인덱스 : i를 증가 시키면 둘의 합 증가, j를 감소시키면 둘의 합 감소
		int i=0, j=N_num.length-1;
		
		int count =0;
		while(i<j) {
			if(N_num[i]+N_num[j]>M) {
				j--;
			}
			else if(N_num[i]+N_num[j]<M) {
				i++;
			}
			else {
				count++;
				i++;
				j--;
			}
		}
		System.out.print(count);
		br.close();
	}

}
