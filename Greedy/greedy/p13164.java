package greedy;
import java.util.*;
import java.io.*;
// 행복 유치원
public class p13164 {
	static int N;
	static int K;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> children = new ArrayList<Integer>();
		ArrayList<Integer> dif = new ArrayList<Integer>();
		
		int sum=0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			children.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i=0; i<N-1; i++) {
			dif.add(children.get(i+1)-children.get(i));
		}
		
		Collections.sort(dif);
		for(int i=0; i<N-K; i++) {
			sum += dif.get(i);
		}
		
		System.out.print(sum);
	}

}
