package implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class p1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String N = st.nextToken();
		N = N.toUpperCase();
		
		char[] n = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'N', 'M', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int [] alpha_n1 = new int[26];
		int [] alpha_n2 = new int[26];

		for(int i=0; i<N.length(); i++) {
			char c = N.charAt(i);
			for(int j=0; j<n.length;j++) {
				if(c == n[j]) {
					alpha_n1[j] = alpha_n1[j] + 1;
					alpha_n2[j] = alpha_n2[j] + 1;

				}
			}
		}
		
		Integer[] tmp = Arrays.stream(alpha_n2).boxed().toArray(Integer[]::new);
	    Arrays.sort(tmp, Comparator.reverseOrder()); // ��������

		int x = 0;
		if(tmp[0].equals(tmp[1]))
			x=1;
		
		int index1=0;
		
		for(int i=0; i<alpha_n1.length; i++) {
			if(alpha_n1[i]>alpha_n1[index1]) {
				index1 = i;
			}
				
		}
		if(x==0)
			System.out.print(n[index1]);
		else
			System.out.print("?");
	}
}
