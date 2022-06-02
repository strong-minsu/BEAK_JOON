package math;
import java.io.*;
import java.util.*;
public class p1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int count=0;
		int tmp;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			tmp=0;
			if(num==1)
				count--;
			for(int j=1; j<num; j++) {
				
				if(num%j==0 && j!=1) {
					tmp++;
				}
			}
			if(tmp==0) {
				count++;
			}
		}
		System.out.print(count);
	}

}
