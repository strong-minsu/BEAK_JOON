package greedy;
import java.util.*;
import java.io.*;

public class p11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		//greedy..?
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0; i<N; i++) {
			array.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(array);
		int sum=0;
		for(int i=0; i<array.size(); i++) {
			int count=0;
			for(int j=0; j<=i; j++) {
				count += array.get(j);
			}
			sum += count;
		}
		sb.append(sum);
		System.out.print(sb);
	}
}
