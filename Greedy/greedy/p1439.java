package greedy;
import java.util.*;
import java.io.*;
// ������
public class p1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		//��ū�� ���� �Ǻ�
		StringTokenizer st1 = new StringTokenizer(S, "0");
		StringTokenizer st0 = new StringTokenizer(S, "1");
		
		System.out.print(Math.min(st1.countTokens(), st0.countTokens()));
	}

}
