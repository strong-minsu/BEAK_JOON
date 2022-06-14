package data_structure;
import java.util.*;
import java.io.*;
public class p9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String s="";
		char temp;
		
		Stack<String> stack = new Stack<>();
		for(int i=0; i<N; i++) {
			stack.clear();
			int count =0;
			st = new StringTokenizer(br.readLine());
			s = st.nextToken();
			
			for(int j=0; j<s.length(); j++) {
				temp = s.charAt(j);
				if(Character.compare(temp, '(') == 0) {
					stack.push("(");
				}
				else {
					if(stack.isEmpty()) {
						count =1;
					}
					else {
						stack.pop();
					}
				}
				
				if(j == s.length()-1 && !stack.isEmpty())
					count = 1;
			}
			
			if(count==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
