package math;
import java.util.*;
import java.io.*;
public class p2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int []n = new int[N];
		double sum=0;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			n[i] = Integer.parseInt(st.nextToken());
			sum += n[i];
		}
		Arrays.sort(n);
		//Æò±Õ 
		double avg = sum / N;
		sb.append(Math.round(avg)).append("\n");
		
		//Áß¾Ó°ª
		sb.append(n[N/2]).append("\n");
		
		//ÃÖºó°ª
		int count = 0;
		int max = -1;
		int mod = n[0];
		boolean check = false;
		
		for(int i=0; i<N-1; i++) {
			if(n[i]== n[i+1]) {
				count++;
			}
			else {
				count = 0;
			}
			if(max < count) {
				max = count;
				mod = n[i];
				check = true;
			}
			else if(max == count && check == true) {
				mod = n[i];
				check = false;
			}
		}
		sb.append(mod).append("\n");
		
		//¹üÀ§
		int l = n[N-1] - n[0];
		sb.append(l);
		
		System.out.print(sb);
	}

}
