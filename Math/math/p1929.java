package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class p1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		// �迭 ����� ���ÿ� false�� �ʱ�ȭ
		boolean [] array = new boolean[N+1];
		//0�� 1�� �׻� �Ҽ��� �ƴ� =>true�� 
		array[0] = true;
		array[1] = true;
		
		
		//�����佺�׳׽��� ü�� x��� ���� �Ҽ������� �Ǵ��Ϸ��� �� ��, 
		//�ϳ��� �ݺ��ϸ� �Ҽ������� �Ǻ��ϴ� ���� �ƴ϶�,
		//x�� ��Ʈ�� ���� ���� ��������� Ȯ���ϸ� �ȴٴ� ����̴�.
		
		for(int i=2; i<Math.sqrt(N+1); i++) {
			for(int j=i*i; j<N+1; j+=i) {
				array[j] = true;
			}
		}
		
		for(int i=M; i<array.length; i++) {
			if(array[i] == false) {
				System.out.println(i);
			}
			else
				continue;
		}
		
	}

}
