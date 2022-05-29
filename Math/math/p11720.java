package math;
import java.util.*;

public class p11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		//범위가 매우 커짐 long이나 int로 해결 불가능
		//문자열로 저장후 char 배열-> int형 배열 -> 계산
		String String_num = sc.next();
		
		// sting을 char배열에 저장
		char [] Char_num = String_num.toCharArray();
		
		int sum = 0;
		for(int i=0; i<Char_num.length;i++) {
			//Char_num[i]를 정수형으로 변환하면서 sum에 저장하기
			sum += Char_num[i] - '0';
		}
		System.out.println(sum);
	}
}
