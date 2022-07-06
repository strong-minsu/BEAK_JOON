package greedy;
import java.util.*;
import java.io.*;
public class p14659 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int [] hight = new int[N];
		
		for(int i=0; i<N; i++) {
			hight[i] = Integer.parseInt(st.nextToken());
		}
		
		int count;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<N; i++) {
			count=0;
			for(int j=i+1; j<N; j++) {
				if(hight[i]>hight[j]) {
					count++;
				}
				else
					break;
			}
			max = Math.max(count, max);
		}
		System.out.print(max);
	}
}
