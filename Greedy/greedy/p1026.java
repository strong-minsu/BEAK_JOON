package greedy;
import java.util.*;
import java.io.*;
public class p1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			B.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(A);
		Collections.sort(B, Collections.reverseOrder());
		int sum =0;
		for(int i=0; i<N; i++) {
			sum += A.get(i)*B.get(i);
		}
		bw.write(String.valueOf(sum));
		bw.flush();
	}

}
