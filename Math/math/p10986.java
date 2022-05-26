package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//���� �� �̿�
public class p10986 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stTokenizer = 
				new StringTokenizer(bfReader.readLine());
		//���� ����
		int N = Integer.parseInt(stTokenizer.nextToken());
		int M = Integer.parseInt(stTokenizer.nextToken());
		
		long count[] = new long[M];
		long answer = 0;
		long remainder;
		
		//���� �� �迭 (�ʱ�ȭ �ʿ� ����, �⺻������ 0���� �ʱ�ȭ ��)
		long S[] = new long[N+1];
		stTokenizer = 
				new StringTokenizer(bfReader.readLine());
				
		for(int i=1; i<N+1; i++) {
			S[i] = S[i-1] +Integer.parseInt(stTokenizer.nextToken());
		}
		
		//���� ���� Ư�� j+1���� i���� ���� ������ �迭 S[i]-S[j]��� �� �� ����
		//�̶� S[i]�� S[j]�� M���� ������ �� �������� ������, (S[i] - S[j] ) % M = 0 �� �����Ѵ�.
		for(int i=1; i<N+1; i++) {
			remainder = (int) (S[i] % M);
			if(remainder == 0)
				answer++;
			
			//������ �迭 �� ������
			count[(int) remainder]++;
		}
		
		for(int i=0; i<M; i++) {
			if(count[i]>=2)
				//count[i]�� ���� �� 2�� ���� (���� ����)
				answer = answer + (count[i]*(count[i]-1))/2;
		}
		System.out.print(answer);
	}
}
