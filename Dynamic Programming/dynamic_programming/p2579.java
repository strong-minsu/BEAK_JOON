package dynamic_programming;
import java.util.*;
import java.io.*;
public class p2579 {
	private static int [] number;
	private static int [] count;
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//
		number = new int[301];
		count = new int[301];

		for(int i=1; i<N+1; i++) {
			number[i] = Integer.parseInt(br.readLine());
		}
		count[1] = number[1];
		count[2] = number[2]+number[1];
		count[3] = Math.max(number[1], number[2]) + number[3];
		
		for(int i=4; i<N+1; i++) {
			count[i] = Math.max(count[i-3]+number[i-1], count[i-2]) + number[i];
		}
		System.out.print(count[N]);
	}
}
