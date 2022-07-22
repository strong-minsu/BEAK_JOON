package data_structure;
import java.util.*;
import java.io.*;

public class p17219 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, String> password = new HashMap<>();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			String p = st.nextToken();
			
			password.put(s, p);
		}
		for(int i=0; i<M; i++) {
			String key = br.readLine();
			bw.write(password.get(key));
			bw.write("\n");
		}
		bw.flush();
	}
}
