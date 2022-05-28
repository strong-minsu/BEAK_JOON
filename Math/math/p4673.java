package math;

public class p4673 {
	//d(n) = n+n의 각 자리 수 10000까지밖에 없음
	public static int d(int n) {
		int sum = n;
		while(n>0) {
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] number = new int[10001]; //1부터 저장
		int[] number_self = new int[10001]; //1부터 저장

		int no_self;
		for(int i=1;i<number.length; i++) {
			number[i] = i;
			number_self[i] = i;
		}
		for(int i=1; i<number.length;i++) {
			no_self = d(number[i]);
			if(no_self<=10000) {
				number_self[no_self] = 0;
			}
		}
		for(int i=0; i<number_self.length;i++) {
			if(number_self[i]!=0)
				System.out.println(number_self[i]);
		}
	}
}

