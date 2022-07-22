package greedy;
// 2+1 ºº¿œ
import java.util.*;
import java.io.*;
public class p11508 {
	static int N;
	static int C;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long sum = 0;
		N = Integer.parseInt(br.readLine());
		Integer C_array[] = new Integer[N];
		for(int i=0; i<N; i++) {
			int c = Integer.parseInt(br.readLine());
			C_array[i] = c;
			sum += c;
		}
		Arrays.sort(C_array, Comparator.reverseOrder());
		int count = N/3;
		int re = N%3;
		int index = 2;
		while(count>0) {
			sum -= C_array[index];
			index += 3;
			count--;
		}
		System.out.print(sum);
	}
}
