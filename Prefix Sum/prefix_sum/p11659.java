package prefix_sum;
import java.io.*;
import java.util.*;

//구간 합 4
public class p11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stTokenizer = 
				new StringTokenizer(bfReader.readLine());
		int i, j;
		//수의 개수
		int N = Integer.parseInt(stTokenizer.nextToken());
		//합 구해야하는 횟수
		int M = Integer.parseInt(stTokenizer.nextToken());
		
		//구간 합 배열 (초기화 필요 없음, 기본적으로 0으로 초기화 됨)
		long S[] = new long[N+1];
		stTokenizer = 
				new StringTokenizer(bfReader.readLine());
		
		for(int k=1; k<N+1; k++) {
			S[k] = S[k-1] +Integer.parseInt(stTokenizer.nextToken());
		}
		
		//정답 배열
		long answer[] = new long[M];
		for(int l=0; l<M; l++) {
			stTokenizer = 
					new StringTokenizer(bfReader.readLine());
			i = Integer.parseInt(stTokenizer.nextToken());
			j = Integer.parseInt(stTokenizer.nextToken());
			
			//구간 합 10 크기의 배열일 때, 
			//9~10의 구간합을 구하고 싶음, 즉 9+10을 구하고 싶음 1~10 - 1~8 수행 후 정답 배열에 추가
			answer[l] = (S[j] - S[i-1]);
		}
		
		//문제 정답 출력
		for(int u=0; u<M; u++)
			System.out.println(answer[u]);
		
	}
}
