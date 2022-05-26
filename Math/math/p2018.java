package math;
import java.util.*;

public class p2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int start=0, end=0; //투포인터 설정
		int sum=0, cnt=0; //sum: 합, cnt: 가지수(정답)
		while(start<=N) {
			while(++end<=N) { //end 증가
				sum += end; //부분합을 증가
				if(sum>=N) {
					if(sum==N) cnt++;
					break;
				}
			}
			while(++start<=N) { //start 증가
				sum -= start; //부분합을 감소
				if(sum<=N) {
					if(sum==N) cnt++;
					break;
				}
			}	
		}
		System.out.println(cnt); 
	}

}
