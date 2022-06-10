package implementation;
import java.util.*;
public class p25286 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int []Y = new int[T];
		int []M = new int[T];

		for(int i=0; i<T; i++) {
			Y[i] = sc.nextInt();
			M[i] = sc.nextInt();
		}
		
		for(int i=0; i<T; i++) {
			
			int year = Y[i];
			int month = M[i]-1;
			int day;
			
			if(month==0) {
				year = Y[i]-1;
				month = 12;
			}
			
			if(month==4 || month==6 || month==9 || month==11 ) {
				day = 30;
				System.out.println(year+" "+ month+" "+day);

			}
			
			else {
				if(month==2) {
					if((year%400 == 0) || (year%4 == 0 && year%100 != 0)) {
						day = 29;
					}
					else
						day = 28;
					System.out.println(year+" "+ month+" "+day);

				}
				
				else {
					day = 31;
					System.out.println(year+" "+ month+" "+day);

				}
			}
		}
	}

}
