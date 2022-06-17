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
		max++; //���� ���� �ִ���� +1�� ��ƾ���
		long min=0;
		long mid=0;
		
		while(min < max) {
			mid = (min+max)/2;
			long count=0;
			
			// ������ �߰� ���̷� k�迭�� ��ҵ� ������ �� ���� ����������� ���Ѵ�.
			for(int i=0; i<k.length; i++) {
				count += (k[i]/mid);
			}
			/*
			 *  [upper bound ����]
			 *  
			 *  mid���̷� �߶��� ���� ������ ������� �ϴ� ������ �������� �۴ٸ�
			 *  �ڸ����� �ϴ� ���̸� ���̱� ���� �ִ� ���̸� ���δ�.
			 *  �� �ܿ��� �ڸ����� �ϴ� ���̸� �÷��� �ϹǷ� �ּ� ���̸� �ø���.
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
