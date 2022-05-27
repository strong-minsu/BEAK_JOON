package math;
import java.util.*;

public class p1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long i = 0, c = 0;
		long sum = 0;
		
		while(true) {
			// 조건에 상관없이 작은 정수부터 증가
			i++;	
			
			//지금까지 합이 입력받은 수보다 작은 경우
			if(sum < S) {
				//작은수부터 더했을 때 부족한 값에 대한 조건문
				
				// 남은 값이 2*i 보다 큰 경우 (i를 더한다)
				if(S-(sum+2*i) > 0) {
					sum = sum + i;
				}
				
				//작은 경우(나머지 값을 더한다)
				else {
					sum = sum + (S-sum);
				}
				
				//횟수계산
				c++;
			}
			//같은 경우 출력
			else {
				System.out.print(c);
				break;
			}
		}
	}
}
