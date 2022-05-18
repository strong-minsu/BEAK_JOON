package simulation;
import java.util.*;

public class p1436 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int c = 0;
		int n = 0;
		String temp = new String(" ");
		
		while(true) {
			c++;
			temp = Integer.toString(c);
			if(temp.contains("666")){
				n++;
				if(n == N) {
					System.out.print(c);
					break;
				}
			}
		}
	}
}
