package math;
import java.util.*;
//16�ڸ��� �ѱ� �Ҽ����� ���� �� �ִ�.

public class p1312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		
		//������ ���
		int result = A % B;
		
		//�ڸ�����ŭ ���..
		for(int i=1; i<N; i++) {
			result = result*10;
			result = result % B;
		}
		result = result*10;
		System.out.println(result/B);
	}

}
