package dynamic_programming;
//�Ž�����
import java.util.*;
import java.io.*;
public class p14916 {
	// �Ž�����
	static int n;
	// ���� ����
	static int count=0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		while(n>0) {
			if(n%5 == 0) {
				//5�� �������� ��� (�� ��ŭ ���� ������Ų �� �ݺ��� ����)
				count += n/5;
				break;
			}
			else{
				//�������� ���� ��� (2�� ������ ���� ����)
				n -= 2;
				count++;
			}
		}

		if(n<0) {
			// 2, 5 �������� �Ž��� �� �� ���� ���
			System.out.print(-1);
		}
		else {
			System.out.print(count);
		}
	}
}
