package sorting;

import java.io.*;
import java.util.*;

public class p10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		for(int i=0; i<N; i++){
			array[i] = Integer.parseInt(br.readLine());
		}
		//일반 배열 정렬
		Arrays.sort(array);
		
		for(int num : array) {
			sb.append(num).append('\n');
		}

		System.out.println(sb);
	}

}
//counting sort를 이용한 정렬
/*public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int count[] = new int[10001];
		for(int i=0; i<N; i++) {
			count[Integer.parseInt(br.readLine())]++;
		}

		for(int i=1; i<10001; i++) {
			while(count[i] > 0) {
				sb.append(i).append('\n');
				count[i]--;
			}
		}

		System.out.println(sb);
	}
}*/