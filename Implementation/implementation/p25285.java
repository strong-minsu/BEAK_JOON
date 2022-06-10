package implementation;
import java.util.*;
public class p25285 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double []cm = new double[T];
		double []kg = new double[T];
		double []m2 = new double[T];

		for(int i=0; i<T; i++) {
			cm[i] = sc.nextDouble();
			kg[i] = sc.nextDouble();
			m2[i] = (cm[i]/100*cm[i]/100);
			
		}
		
		/*for(int i=0; i<T; i++) {
			System.out.print(cm[i]);
			System.out.print(kg[i]);
			System.out.println();

		}*/
		double BMI;
		for(int i=0; i<T; i++) {
			if(cm[i]<140.1) {
				System.out.println(6);
			}
			else if(140.1<=cm[i] && cm[i]<146) {
				System.out.println(5);
			}
			else if(140<=cm[i] && cm[i]<159) {
				System.out.println(4);
			}
			else if(159<=cm[i] && cm[i]<161) {
				BMI = kg[i]/m2[i];
				if(BMI<16.0 || BMI>=35.0)
					System.out.println(4);
				else
					System.out.println(3);
			}
			else if(161<=cm[i] && cm[i]<204) {
				BMI = kg[i]/m2[i];
				if(BMI<16.0 || BMI>=35.0)
					System.out.println(4);
				else if((BMI>=16.0 && BMI<18.5) || (BMI>=30.0 && BMI<35.0))
					System.out.println(3);
				
				else if((BMI>=18.5 && BMI<20.0) || (BMI>=25.0 && BMI<30.0))
					System.out.println(2);
				
				else
					System.out.println(1);
			}
			else
				System.out.println(4);
		}
		
	}

}
