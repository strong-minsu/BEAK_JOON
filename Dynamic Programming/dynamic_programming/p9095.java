package dynamic_programming;
import java.util.*;
import java.io.*;

public class p9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int number[] = new int[12];
		number[1] = 1;
		number[2] = 2;
		number[3] = 4;
		for(int i=4; i<number.length; i++) {
			number[i] = number[i-1]+number[i-2]+number[i-3];
		}
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(number[n]).append("\n");
		}
		System.out.print(sb);
	}

}
