package sorting;
import java.io.*;
import java.util.*;

public class p1181{
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String O[]  = new String[N];
		String temp = new String(" ");

		//���� �迭 ����
		for(int i=0; i<N; i++){
			String sb = new String(sc.next());
			O[i] = sb;
		}
		
		Arrays.sort(O);
		//�ε��� ���̸� �������� �����ϴ� �޼ҵ�
		Arrays.sort(O, Comparator.comparing(String::length));
		
		for(int i = 0; i<O.length; i++) {
			if(temp.equals(O[i])) {
				continue;
			}
			else {
				System.out.println(O[i]);
				temp = O[i];
			}
		}
	}
}