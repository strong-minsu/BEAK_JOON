package math;
import java.util.*;

public class p2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int start=0, end=0; //�������� ����
		int sum=0, cnt=0; //sum: ��, cnt: ������(����)
		while(start<=N) {
			while(++end<=N) { //end ����
				sum += end; //�κ����� ����
				if(sum>=N) {
					if(sum==N) cnt++;
					break;
				}
			}
			while(++start<=N) { //start ����
				sum -= start; //�κ����� ����
				if(sum<=N) {
					if(sum==N) cnt++;
					break;
				}
			}	
		}
		System.out.println(cnt); 
	}

}
