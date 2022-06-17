package binary_search;
import java.util.*;
import java.io.*;

public class p1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int []k = new int[K];
		long max = 0;
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine());
			k[i] = Integer.parseInt(st.nextToken());
			if(k[i]>max)
				max = k[i];
		}
		max++; //랜선 값을 최대길이 +1로 잡아야함
		long min=0;
		long mid=0;
		
		while(min < max) {
			mid = (min+max)/2;
			long count=0;
			
			// 구해진 중간 길이로 k배열의 요소들 나눠서 몇 개가 만들어지는지 구한다.
			for(int i=0; i<k.length; i++) {
				count += (k[i]/mid);
			}
			/*
			 *  [upper bound 형식]
			 *  
			 *  mid길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면
			 *  자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
			 *  그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
			 */
			if(count < N) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		sb.append(min-1);
		System.out.println(sb);
	}
}
