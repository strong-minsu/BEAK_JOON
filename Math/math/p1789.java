package math;
import java.util.*;

public class p1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long i = 0, c = 0;
		long sum = 0;
		
		while(true) {
			// ���ǿ� ������� ���� �������� ����
			i++;	
			
			//���ݱ��� ���� �Է¹��� ������ ���� ���
			if(sum < S) {
				//���������� ������ �� ������ ���� ���� ���ǹ�
				
				// ���� ���� 2*i ���� ū ��� (i�� ���Ѵ�)
				if(S-(sum+2*i) > 0) {
					sum = sum + i;
				}
				
				//���� ���(������ ���� ���Ѵ�)
				else {
					sum = sum + (S-sum);
				}
				
				//Ƚ�����
				c++;
			}
			//���� ��� ���
			else {
				System.out.print(c);
				break;
			}
		}
	}
}
