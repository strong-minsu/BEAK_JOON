package recursion;
import java.util.*;
import java.io.*;
// ������ �����
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
		// �迭�� �����ϱ�
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
		//4���� ������ ������ �˻�(recursion)
		//1�� ��
		recursion(newSize, r, c);
		//2�� ��
		recursion(newSize, r, c+newSize);	
		//3�� ��
		recursion(newSize, r+newSize, c);	
		//4�� ��
		recursion(newSize, r+newSize, c+newSize);	
		
	}
	static boolean chackpaper(int size, int r, int c) {
		int color = paper[r][c];
		
		for(int i=r; i<size+r; i++) {
			for(int j=c; j<size+c; j++) {
				//paper �迭�� ù��° ��ҿ� �� 
				if(paper[i][j] != color) {
					//�ٸ� ���� ���� ���� false return
					return false;
				}
			}
		}
		//false return�ȵ� ���� ��, �˻� ��� ����� true return
		return true;
	}
}
