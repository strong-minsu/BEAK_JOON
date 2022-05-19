package math;

import java.util.*;

public class p1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int x1, y1, r1;
		int x2, y2, r2;
		int result[] = new int[T];
		
		double d = 0;
		double x12, y12;
		
		for(int i=0; i<T; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			//거리 계산
			x12 = Math.pow((x1-x2), 2);
			y12 = Math.pow((y1-y2), 2);
			d = Math.sqrt(x12 + y12); 
			
			//무한
			if(x1==x2 && y1==y2 && r1==r2)
				result[i] = -1;
			
			//없는 경우
			else if(Math.abs(r2-r1) > d ||
					x1==x2 && y1==y2 && r1!=r2 ||
					d > r1+r2)
				result[i] = 0;
			
			//한 점
			else if(d == r1+r2 || Math.abs(r2-r1) == d )
				result[i] = 1;
			
			//두 점
			else
				result[i] = 2;
		}
		for(int i=0; i<T; i++) {
			System.out.println(result[i]);
		}
	}
}
