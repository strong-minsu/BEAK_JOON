package sorting;
import java.util.*;

public class p1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = new String(sc.next());
		char c[] = new char[temp.length()];
		int s[] = new int[temp.length()];
		
		//char로 저장후 숫자를 int형 배열에 넣어준다.
		for(int i=0; i< temp.length(); i++) {
			c[i] = temp.charAt(i);
			s[i] = Character.getNumericValue(c[i]);
		}
		//정렬하기 배열 s를 int로 정의 했으므로 내림차순 메소드를 사용할 수 없다..
		Arrays.sort(s);
		//내림차순으로 출력
		for(int i=temp.length()-1; i>=0; i--) {
			System.out.print(s[i]);
		}
	}
}
