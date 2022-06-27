package binary_search;
import java.util.*;
import java.io.*;
public class p2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		long []n = new long[N];
		long max = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			n[i] = Long.parseLong(st.nextToken());
			if(n[i]>max)
				max = n[i];
		}
		max++; //랜선 값을 최대길이 +1로 잡아야함
		long min=0;
		long mid=0;
		
		while(min < max) {
			mid = (min+max)/2;
			long count=0;
			
			// 구해진 중간 길이로 n배열의 요소들 빼서 몇 미터가 만들어지는지 구한다.
			for(int i=0; i<n.length; i++) {
				if((n[i]-mid)>0)
					count += (n[i]-mid);
			}
			/*
			 *  [upper bound 형식]
			 *  
			 *  mid길이로 잘랐을 때의 합쳐진 길이가가 만들고자 하는 나무의 길이보다 작다면
			 *  자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
			 *  그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
			 */
			if(count < M) {
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
