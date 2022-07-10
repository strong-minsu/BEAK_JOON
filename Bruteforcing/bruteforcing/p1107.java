package bruteforcing;
import java.util.*;
import java.io.*;

public class p1107 {
	static boolean[] broken = new boolean[10]; // 0~10

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // �̵� ���ϴ� ä��
		int m = Integer.parseInt(br.readLine());  // ���ھ� ä�� ����
		
		StringTokenizer st;
		if(m !=0) {
		    st = new StringTokenizer(br.readLine());
		    for (int i = 1; i <= m; i++) {
		        int t = Integer.parseInt(st.nextToken());
		        broken[t] = true;
		    }
		}

		int answer = Math.abs(n - 100);
		/*
		 * �ʱ� ä���� 100�̴�. ��� �������� ���ڹ�ư�� ���峵�� ��� +-��ư���θ��̵� �����ϵ��� �ʱⰪ�� �������ش�.
		 */

		// 0���� 1000000���� ��� ä���� ���鼭 N���� ���� ���� ��ư�� ���� �̵��� �� �ִ� ä���� ã�´�.
		for (int i = 0; i < 1000000; i++) {
			int c = i;
			int len = possible(c);
			// len ����: c�� ���ڹ�ư���� �̿��ؼ� �̵��� ��������, �����ϴٸ� �� ���� ��ư�� �������� ���ϴ� ����
			if (len > 0) {
				int press = Math.abs(c - n);
				// press: ���ڹ�ư���� n�� �ִ��� �����ϰ� �̵����� +�Ǵ� -�� �� �� ������ �ϴ��� ���ϴ� ����
				answer = Math.min(answer, len+press);
			}
		}
		System.out.println(answer);
	}

	static int possible(int c) {
		if (c == 0) { //0�϶� ����ó��
			if (broken[0]) {
				return 0;
			} else {
				return 1;
			}
		}
		int len = 0;
		while (c > 0) {
			if (broken[c % 10]) {
				return 0;
			}
			len += 1;
			c /= 10;
		}
		return len;
	}
}
