package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class P4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int []num_array = new int[3];
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<3;i++) {
				num_array[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num_array);
			if(num_array[0]==0 && num_array[1]==0 && num_array[2]==0)
				break;
			else {
				if(num_array[0]*num_array[0]+num_array[1]*num_array[1] == num_array[2]*num_array[2])
					System.out.println("right");
				else
					System.out.println("wrong");

			}
		}
	}
}
