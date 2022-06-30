package implementation;
import java.util.*;
import java.io.*;
public class p11723 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(st.nextToken());
		LinkedList<Integer> S = new LinkedList<Integer>();
		
		int index;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int num;
			
			if(str.equals("add")) {
				num = Integer.parseInt(st.nextToken());
				if(!S.contains(num)) {
					S.add(num);
				}
			}
			else if(str.equals("remove")) {
				num = Integer.parseInt(st.nextToken());
				if(S.contains(num)) {
					index = S.indexOf(num);
					S.remove(index);
				}
			}
			else if(str.equals("remove")) {
				num = Integer.parseInt(st.nextToken());
				if(S.contains(num)) {
					index = S.indexOf(num);
					S.remove(index);
				}
			}
			else if(str.equals("check")) {
				num = Integer.parseInt(st.nextToken());
				if(S.contains(num)) {
					sb.append(1).append("\n");
				}
				else {
					sb.append(0).append("\n");
				}
			}
			else if(str.equals("toggle")) {
				num = Integer.parseInt(st.nextToken());
				if(S.contains(num)) {
					index = S.indexOf(num);
					S.remove(index);
				}
				else {
					S.add(num);
				}
			}
			else if(str.equals("all")) {
				S.clear();
				for(int j=1; j<21; j++) {
					S.add(j);
				}
			}
			else if(str.equals("empty")) {
				S.clear();
			}
			
		}
		System.out.print(sb);
	}
}
