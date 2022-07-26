package greedy;
//ȸ�ǽ� �����ϱ�
import java.util.*;
import java.io.*;
public class p1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N  = Integer.parseInt(st.nextToken());
		int [][]array = new int [N][2];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			//0, 1 ���� ���۽ð�, ����ð� ����
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//����, ����ð��� ���� ������, ���� ����ð��� ������ ���۽ð��� ���� ��
		Arrays.sort(array, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
		
		int count=0;
		int end=-1;
		for(int i=0; i<N; i++) {
			//��ġ�� ���� ���� ȸ�ǰ� ���� ���
			if(array[i][0]>=end) {
				//����ð� �Է�
				end=array[i][1];
				count++;
			}
		}
		System.out.print(count);
	}

}
