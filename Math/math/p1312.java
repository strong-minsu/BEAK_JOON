package math;
import java.util.*;
//16자리를 넘긴 소수점을 구할 수 있다.

public class p1312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		
		//나머지 계산
		int result = A % B;
		
		//자리수만큼 계산..
		for(int i=1; i<N; i++) {
			result = result*10;
			result = result % B;
		}
		result = result*10;
		System.out.println(result/B);
	}

}
