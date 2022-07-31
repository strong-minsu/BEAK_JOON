package math;
import java.util.*;
import java.io.*;
// »õ
public class p1568 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K=1;
		int count = 0;
		while(N > 0) {
			if(N>=K) {
				N -= K;
				K++;
				count++;
			}
			else {
				K = 1;
			}
		}
		System.out.print(count);
	}
}
