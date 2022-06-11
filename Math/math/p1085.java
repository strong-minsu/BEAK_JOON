package math;
import java.util.*;
public class p1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int array[] = {x, y, (w-x), (h-y)};
		int min_num = 0;
		
		for(int i=0; i<array.length; i++) {
			if(i==0)
				min_num = array[i];
			min_num = Math.min(min_num, array[i]);
		}
		System.out.print(min_num);
	}

}
