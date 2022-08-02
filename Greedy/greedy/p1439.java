package greedy;
import java.util.*;
import java.io.*;
// 뒤집기
public class p1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		//토큰의 수로 판별
		StringTokenizer st1 = new StringTokenizer(S, "0");
		StringTokenizer st0 = new StringTokenizer(S, "1");
		
		System.out.print(Math.min(st1.countTokens(), st0.countTokens()));
	}

}
