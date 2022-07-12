package implementation;
import java.util.*;
import java.io.*;

public class p1235 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String [] studentNumber = new String[N];
		String [] origin = new String[N];
		
		//자른 번호를 담는 곳
		int number[] = new int[N];
		int n = 0;
		
		for(int i=0; i<N; i++) {
			StringBuffer s = new StringBuffer(br.readLine());
			studentNumber[i] = s.reverse().toString();
			origin[i] = studentNumber[i];
		}
		n = studentNumber[0].length();
		
		int count = 0;
		for(int i=1; i<=n; i++) {
			count++;
			for(int j=0; j<N; j++) {		
				String s = studentNumber[j].substring(0,i);
				studentNumber[j] = s;
			}
			Set<String> set = new HashSet<>(Arrays.asList(studentNumber));
			if(set.size() == origin.length) {
				break;
			}
			for(int k=0; k<N; k++) {
				studentNumber[k] = origin[k];
			}
		}
		System.out.print(count);
	}

}
