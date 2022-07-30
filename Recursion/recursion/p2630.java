package recursion;
import java.util.*;
import java.io.*;
// 색종이 만들기
public class p2630 {
	static int white;
	static int blue;
	static int N; 
	static int [][] paper;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		paper = new int [N][N];
		// 배열에 저장하기
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		recursion(N, 0, 0);
		System.out.println(white);
		System.out.println(blue);
	}
	static void recursion(int size, int r, int c) {
		
		if(chackpaper(size, r, c)) {
			if(paper[r][c]==0) {
				white++;
			}
			else {
				blue++;
			}
			return;
		}
		
		int newSize = size/2;
		//4개의 면으로 나눠서 검사(recursion)
		//1번 면
		recursion(newSize, r, c);
		//2번 면
		recursion(newSize, r, c+newSize);	
		//3번 면
		recursion(newSize, r+newSize, c);	
		//4번 면
		recursion(newSize, r+newSize, c+newSize);	
		
	}
	static boolean chackpaper(int size, int r, int c) {
		int color = paper[r][c];
		
		for(int i=r; i<size+r; i++) {
			for(int j=c; j<size+c; j++) {
				//paper 배열에 첫번째 요소와 비교 
				if(paper[i][j] != color) {
					//다른 색이 나온 순간 false return
					return false;
				}
			}
		}
		//false return안된 상태 즉, 검사 모두 통과시 true return
		return true;
	}
}
