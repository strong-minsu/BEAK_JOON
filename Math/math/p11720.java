package math;
import java.util.*;

public class p11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		//������ �ſ� Ŀ�� long�̳� int�� �ذ� �Ұ���
		//���ڿ��� ������ char �迭-> int�� �迭 -> ���
		String String_num = sc.next();
		
		// sting�� char�迭�� ����
		char [] Char_num = String_num.toCharArray();
		
		int sum = 0;
		for(int i=0; i<Char_num.length;i++) {
			//Char_num[i]�� ���������� ��ȯ�ϸ鼭 sum�� �����ϱ�
			sum += Char_num[i] - '0';
		}
		System.out.println(sum);
	}
}
