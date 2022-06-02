package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class p1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		// 배열 선언과 동시에 false로 초기화
		boolean [] array = new boolean[N+1];
		//0과 1은 항상 소수가 아님 =>true로 
		array[0] = true;
		array[1] = true;
		
		
		//에라토스테네스의 체는 x라는 값이 소수인지를 판단하려고 할 때, 
		//하나씩 반복하며 소수인지를 판별하는 것이 아니라,
		//x의 루트를 씌운 값의 배수까지만 확인하면 된다는 방법이다.
		
		for(int i=2; i<Math.sqrt(N+1); i++) {
			for(int j=i*i; j<N+1; j+=i) {
				array[j] = true;
			}
		}
		
		for(int i=M; i<array.length; i++) {
			if(array[i] == false) {
				System.out.println(i);
			}
			else
				continue;
		}
		
	}

}
