package sorting;
import java.util.*;

public class p1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = new String(sc.next());
		char c[] = new char[temp.length()];
		int s[] = new int[temp.length()];
		
		//char�� ������ ���ڸ� int�� �迭�� �־��ش�.
		for(int i=0; i< temp.length(); i++) {
			c[i] = temp.charAt(i);
			s[i] = Character.getNumericValue(c[i]);
		}
		//�����ϱ� �迭 s�� int�� ���� �����Ƿ� �������� �޼ҵ带 ����� �� ����..
		Arrays.sort(s);
		//������������ ���
		for(int i=temp.length()-1; i>=0; i--) {
			System.out.print(s[i]);
		}
	}
}
