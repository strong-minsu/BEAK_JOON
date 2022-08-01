package greedy;
import java.util.*;
import java.io.*;
// 폴리오미노
public class p1343 {
	static String string;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "");
		StringBuilder sb = new StringBuilder();
		string = st.nextToken();

		int polyomino=0;
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i) =='X') {
				polyomino++;
			}
			else {
				if(polyomino%2 == 1) {
					sb = new StringBuilder();
					sb.append("-1");
					break;
				}
				else {
					while(polyomino != 0) {
						if(polyomino >= 4) {
							sb.append("AAAA");
							polyomino -= 4;
						}
						else {
							sb.append("BB");
							polyomino -= 2;
						}
					}
				}
				sb.append(".");
			}
		}
		//마지막은 .으로 끝나지 않아 출력이 안될 수 있음 (x가 0보다 클 경우)
		if(polyomino > 0) {
			if(polyomino%2 == 1) {
				sb = new StringBuilder();
				sb.append("-1");
			}
			else {
				while(polyomino != 0) {
					if(polyomino >= 4) {
						sb.append("AAAA");
						polyomino -= 4;
					}
					else {
						sb.append("BB");
						polyomino -= 2;
					}
				}
			}
		}
		
		System.out.print(sb);
		
	}
}
