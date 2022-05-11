package math;
import java.util.*;
//상수

public class p2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int t1, t2, t3 = 0;
		int t4, t5, t6 = 0;
		
		t1 = num1/100; //100자리수
		t2 = num1%10; //1자리수
		t3 = (num1/10)%10; //10자리수

		t4 = num2/100;
		t5 = num2%10;
		t6 = (num2/10)%10;
		
		num1 = t1+ t2*100 + t3*10;
		num2 = t4+ t5*100 + t6*10;
		
		if(num1<num2)
			System.out.print(num2);
		else
			System.out.print(num1);
	}
}
