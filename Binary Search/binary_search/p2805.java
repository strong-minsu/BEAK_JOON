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
		max++; //���� ���� �ִ���� +1�� ��ƾ���
		long min=0;
		long mid=0;
		
		while(min < max) {
			mid = (min+max)/2;
			long count=0;
			
			// ������ �߰� ���̷� n�迭�� ��ҵ� ���� �� ���Ͱ� ����������� ���Ѵ�.
			for(int i=0; i<n.length; i++) {
				if((n[i]-mid)>0)
					count += (n[i]-mid);
			}
			/*
			 *  [upper bound ����]
			 *  
			 *  mid���̷� �߶��� ���� ������ ���̰��� ������� �ϴ� ������ ���̺��� �۴ٸ�
			 *  �ڸ����� �ϴ� ���̸� ���̱� ���� �ִ� ���̸� ���δ�.
			 *  �� �ܿ��� �ڸ����� �ϴ� ���̸� �÷��� �ϹǷ� �ּ� ���̸� �ø���.
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
