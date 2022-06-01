package bruteforcing;
import java.util.*;
public class p1018 {
	static char [][] W = {{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},};
	
	static char [][] B = {{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//입력받은 배열
		char[][] NM_array = new char[N][M];
		
		//한 줄씩 입력받을겨
		String st = new String();
		for(int i=0;i<N;i++) {
			st = sc.next();
			for(int j=0;j<M;j++) {
				NM_array[i][j] = st.charAt(j);
			}
		}
		
		
		int min_count =0;
		int total_count = 0;
		
		for(int i=0;i<N-7;i++) {
			for(int j=0;j<M-7;j++) {
				int bw=0;
				int wb=0;
				//배열 비교
				int n=0;
				for(int k=i;k<i+8;k++) {
					int m=0;
					for(int l=j; l<j+8; l++) {
						if(NM_array[k][l] == W[n][m])
							wb++;
						if(NM_array[k][l] == B[n][m])
							bw++;
						m++;
					}
					n++;
				}
				min_count = Math.min(wb, bw);
				if(i==0 && j==0)
					total_count = min_count;
				else {
					total_count = Math.min(min_count, total_count);
				}
			}
		}
		System.out.print(total_count);
		
	}

}
