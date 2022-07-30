package recursion;
// Z
import java.util.*;
import java.io.*;
public class p1074 {
	static int N;
	static int count =0;
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		//�� ���� ������
		int size = (int) Math.pow(2, N);
		
		rf(r, c, size);
		System.out.print(count);
	}
	
	static void rf(int r, int c, int size) {
		if(size == 1) {
			//�շ�
			return;
		}
//		1��и�
		if(r < size/2 && c < size/2) {
			rf(r, c, size/2);
		}
//		2��и�
		else if(r < size/2 && c >= size/2) {
			count += (size/2)*(size/2);
			rf(r, c-(size/2), size/2);
		}
//		3��и�
		else if(r >= size/2 && c < size/2) {
			count += ((size/2)*(size/2)) * 2;
			rf(r-(size/2), c, size/2);
		}
//		4��и�
		else {
			count += ((size/2)*(size/2)) * 3;
			rf(r-(size/2), c-(size/2), size/2);
		}
	}

}
