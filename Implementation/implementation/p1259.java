package implementation;
import java.util.*;
import java.io.*;
public class p1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		while(true) {
			count=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			String N = st.nextToken();
			//N이 0으로 입력되면 반복문 종료
			if(N.equals("0")) {
				break;
			}
			
			else {
				for(int i=0; i<N.length()/2;i++) {
					if(N.charAt(i) == N.charAt((N.length()-1)-i))
						count++;
					else
						continue;
				}
				if(count == N.length()/2)
					System.out.println("yes");
				else
					System.out.println("no");

			}
		}
	}

}
