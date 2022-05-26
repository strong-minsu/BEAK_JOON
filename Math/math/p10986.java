package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//구간 합 이용
public class p10986 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stTokenizer = 
				new StringTokenizer(bfReader.readLine());
		//수의 개수
		int N = Integer.parseInt(stTokenizer.nextToken());
		int M = Integer.parseInt(stTokenizer.nextToken());
		
		long count[] = new long[M];
		long answer = 0;
		long remainder;
		
		//구간 합 배열 (초기화 필요 없음, 기본적으로 0으로 초기화 됨)
		long S[] = new long[N+1];
		stTokenizer = 
				new StringTokenizer(bfReader.readLine());
				
		for(int i=1; i<N+1; i++) {
			S[i] = S[i-1] +Integer.parseInt(stTokenizer.nextToken());
		}
		
		//구간 합의 특성 j+1부터 i까지 합은 구간합 배열 S[i]-S[j]라고 할 수 있음
		//이때 S[i]와 S[j]를 M으로 나눴을 때 나머지가 같으면, (S[i] - S[j] ) % M = 0 이 성립한다.
		for(int i=1; i<N+1; i++) {
			remainder = (int) (S[i] % M);
			if(remainder == 0)
				answer++;
			
			//나머지 배열 값 증가ㄴ
			count[(int) remainder]++;
		}
		
		for(int i=0; i<M; i++) {
			if(count[i]>=2)
				//count[i]의 개수 중 2개 선택 (조합 공식)
				answer = answer + (count[i]*(count[i]-1))/2;
		}
		System.out.print(answer);
	}
}
