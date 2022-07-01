package dynamic_programming;
import java.util.*;

public class p1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num;
		int num1, num2;
		//1 �� �� 0
		//2, 3�� �� 1
		
		int [] n = new int[N+1];
		for(int i=1; i<N+1; i++) {
			if(i == 1) {
				n[i] =0;
			}
			else if(i == 2 || i == 3) {
				n[i] =1;
			}
			else {
				//3�� 2 ��� �������� ��� ��� ����� �� ���� �ɸ��� �� �񱳰� �ʿ���
				if(i % 3 == 0 && i % 2 == 0) {
					num1 = i/3;
					num2 = i/2;
					if(n[num1] <= n[num2] && n[num1] <= n[i-1]) {
						n[i] = n[num1]+1;
					}
					else if(n[num2] <= n[num1] && n[num2] <= n[i-1]) {
						n[i] = n[num2]+1;
					}
					else if(n[i-1]<n[num1] && n[i-1]<n[num2]) {
						n[i] = n[i-1]+1;
					}
				}
				//3���θ� �������� ���
				else if(i % 3 == 0) {
					num = i/3;
					if(n[num]+1 < n[i-1]+1)
						n[i] = n[num]+1;
					else
						n[i] = n[i-1]+1;
				}
				//2�θ� �������� ���
				else if(i % 2 == 0) {
					num = i/2;
					if(n[num]+1 < n[i-1]+1)
						n[i] = n[num]+1;
					else
						n[i] = n[i-1]+1;
				}
				//3�� 2 �� �� �������� �ʴ� ���
				else {
					num = i - 1;
					n[i] = n[num]+1;
				}
			}
		}
		System.out.print(n[N]);
	}
}

		