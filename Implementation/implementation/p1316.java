package implementation;
import java.util.*;
import java.io.*;
public class p1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		LinkedList<Character> cha = new LinkedList<Character>();
		
		int count = 0;
		boolean b;
		for(int i=0; i<N; i++) {
			b = true;
			String word  = br.readLine();
			for(int j=0; j<word.length(); j++) {
				char wordc = word.charAt(j);
				if(j == 0) {
					cha.add(word.charAt(j));
				}
				else {
					if(wordc == word.charAt(j-1)) {
						continue;
					}
					else {
						if(cha.contains(wordc)) {
							b = false;
							break;
						}
						else {
							cha.add(word.charAt(j));
						}
					}
				}
			}
			if(b) {
				count++;
			}
			cha.clear();
		}
		sb.append(count);
		System.out.print(sb);
	}

}
