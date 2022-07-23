package dynamic_programming;
//거스름돈
import java.util.*;
import java.io.*;
public class p14916 {
	// 거스름돈
	static int n;
	// 동전 개수
	static int count=0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		while(n>0) {
			if(n%5 == 0) {
				//5로 나눠지는 경우 (몫 만큼 동전 증가시킨 후 반복문 종료)
				count += n/5;
				break;
			}
			else{
				//나눠지지 않을 경우 (2원 감소후 동전 증가)
				n -= 2;
				count++;
			}
		}

		if(n<0) {
			// 2, 5 동전으로 거슬러 줄 수 없는 경우
			System.out.print(-1);
		}
		else {
			System.out.print(count);
		}
	}
}
