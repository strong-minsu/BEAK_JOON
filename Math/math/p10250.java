package math;
import java.util.*;
import java.io.*;

public class p10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int count =0;
		
		while (count<T) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int w = 0;
			int h = 0;
			int g = 0;
			
			for(int i=0; i<W+1; i++) {
				if(g==N) {
					w = i;
					break;
				}
				for(int j=1; j<H+1; j++) {
					g++;
					if(g==N) {
						h = j;
						break;
					}
				}
			}
			if(w<10) {
				System.out.print(h);
				System.out.print(0);
				System.out.println(w);
			}
			else {
				System.out.print(h);
				System.out.println(w);
			}
			count++;
		}
	}

}
