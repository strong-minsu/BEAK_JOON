package bruteforcing;
import java.io.*;
import java.util.*;
public class p18111 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int [][] ground = new int[N][M]; 
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				int g = Integer.parseInt(st.nextToken());
				ground[i][j] = g;
				
				max = Math.max(max, g);
				min = Math.min(min, g);
			}
		}
		int answerSeconds = Integer.MAX_VALUE; // �ð�
        int answerHeight = -1; // ��

        for (int i = min; i <= max; i++) { // �ּ��� ���� �ִ��� ����

            int seconds = 0;
            int inventory = B;

            for (int j = 0; j < ground.length; j++) {
                for (int k = 0; k < ground[j].length; k++) {
                    int diff = ground[j][k] - i;

                    if(diff > 0) { // �����ؾ� ��
                        seconds += Math.abs(diff) * 2;
                        inventory += Math.abs(diff);
                    }else if(diff < 0){ // �߰��ؾ� ��
                        seconds += Math.abs(diff);
                        inventory -= Math.abs(diff);
                    }
                }
            }
            if(inventory >= 0) {
                if(seconds <= answerSeconds) { // == �� ���ԵǾ�� �� ���׷��� ������ �ִ� ���̸� �Ǻ� ���� ����
                    answerSeconds = seconds;
                    answerHeight = i;
                }
            }
        }
        sb.append(answerSeconds).append(" ").append(answerHeight);
        System.out.print(sb);
	}

}
