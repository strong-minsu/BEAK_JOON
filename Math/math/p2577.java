package math;
import java.util.*;

public class p2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int number_count[] = new int[10];
		int I_number = A * B * C;
		String S_number = String.valueOf(I_number);
		
		for(int i=0; i<S_number.length(); i++) {
			if(S_number.charAt(i) == '0')
				number_count[0]++;
			
			else if(S_number.charAt(i) == '1')
				number_count[1]++;
			
			else if(S_number.charAt(i) == '2')
				number_count[2]++;
			
			else if(S_number.charAt(i) == '3')
				number_count[3]++;
			
			else if(S_number.charAt(i) == '4')
				number_count[4]++;
			
			else if(S_number.charAt(i) == '5')
				number_count[5]++;
			
			else if(S_number.charAt(i) == '6')
				number_count[6]++;
			
			else if(S_number.charAt(i) == '7')
				number_count[7]++;
			
			else if(S_number.charAt(i) == '8')
				number_count[8]++;
			
			else if(S_number.charAt(i) == '9')
				number_count[9]++;
		}
		for(int i=0; i<number_count.length; i++) {
			System.out.println(number_count[i]);
		}

	}

}
