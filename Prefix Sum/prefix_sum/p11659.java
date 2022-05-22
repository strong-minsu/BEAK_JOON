package prefix_sum;
import java.io.*;
import java.util.*;

//���� �� 4
public class p11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stTokenizer = 
				new StringTokenizer(bfReader.readLine());
		int i, j;
		//���� ����
		int N = Integer.parseInt(stTokenizer.nextToken());
		//�� ���ؾ��ϴ� Ƚ��
		int M = Integer.parseInt(stTokenizer.nextToken());
		
		//���� �� �迭 (�ʱ�ȭ �ʿ� ����, �⺻������ 0���� �ʱ�ȭ ��)
		long S[] = new long[N+1];
		stTokenizer = 
				new StringTokenizer(bfReader.readLine());
		
		for(int k=1; k<N+1; k++) {
			S[k] = S[k-1] +Integer.parseInt(stTokenizer.nextToken());
		}
		
		//���� �迭
		long answer[] = new long[M];
		for(int l=0; l<M; l++) {
			stTokenizer = 
					new StringTokenizer(bfReader.readLine());
			i = Integer.parseInt(stTokenizer.nextToken());
			j = Integer.parseInt(stTokenizer.nextToken());
			
			//���� �� 10 ũ���� �迭�� ��, 
			//9~10�� �������� ���ϰ� ����, �� 9+10�� ���ϰ� ���� 1~10 - 1~8 ���� �� ���� �迭�� �߰�
			answer[l] = (S[j] - S[i-1]);
		}
		
		//���� ���� ���
		for(int u=0; u<M; u++)
			System.out.println(answer[u]);
		
	}
}
