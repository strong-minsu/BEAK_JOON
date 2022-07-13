package greedy;
//ทฮวม
import java.util.*;
import java.io.*;
public class p2217 {
	static int N;
	static int max, weight;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int [] rope = new int[N];
		
		for(int i=0; i<rope.length; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(rope);
		max = Integer.MIN_VALUE;
		
		for(int i=0; i<rope.length; i++) {
			weight = rope[i] * (rope.length-i);
			if(weight > max) {
				max = weight;
			}
		}
		
		System.out.print(max);
	}

}
