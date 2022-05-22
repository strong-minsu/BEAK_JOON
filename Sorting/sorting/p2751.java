package sorting;
import java.util.*;

public class p2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0; i<N; i++) {
			array.add(sc.nextInt());
		}
		Collections.sort(array);
		for(Integer val : array) {
			sb.append(val).append("\n");
		}
		
		System.out.println(sb);
	}
}
