package greedy;
import java.util.*;
import java.io.*;
public class p1417 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dasom = Integer.parseInt(br.readLine());
		
		int count=0;
		int [] vot = new int[N-1];
		
		if(N == 1) {
			System.out.print(count);
		}
		
		else {
			for(int i=0; i<N-1; i++) {
				vot[i] = Integer.parseInt(br.readLine());
			}
			while(true) {
				//��� ��������
				Arrays.sort(vot);
				
				boolean flag = true; //����� �ż��� �ʿ䰡 ������ if�� ���Ŀ��� true
				int last = vot.length-1; //�迭���� ���� ū �� 
				//����� �ż��ϴ� ����
				if(dasom <= vot[vot.length-1]) {
					dasom ++;
					vot[last]--;
					count++;
					flag = false;
				}
				//�ټ��� �� �̻� ����� �ż����� ������ while�� ����
				if(flag) {
					break;
				}
			}
			System.out.print(count);
		}
	}
	
}
