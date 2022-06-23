package implementation;
import java.util.*;
import java.io.*;
public class p14467 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int [] cow = new int[11];
		for(int i=1; i<cow.length; i++) {
			cow[i] = 2;
		}
		int count=0;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int cow_number = Integer.parseInt(st.nextToken());
			int cow_location = Integer.parseInt(st.nextToken());
			
			int cn = cow[cow_number];
			if(cn == 2) {
				cow[cow_number] = cow_location;
			}
			else if(cn != cow_location && cn != 2){
				cow[cow_number] = cow_location;
				count++;
			}
		}
		sb.append(count);
		System.out.print(sb);
	}
}
