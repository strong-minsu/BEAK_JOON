package math;
import java.util.*;
import java.io.*;
public class p1094 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int sum = 64;
		int temp = 0;
		int count =0;
		while(X != 0) {
			if(sum > X) {
				sum /= 2;
			}
			else {
				X -= sum;
				count++;
			}
		}
		System.out.print(count);
	}

}
