package sorting;
import java.io.*;
import java.util.*;

//time out 2... ha..tlq..kf
public class p1181{
	/*public static String[] removeRE(String[] arrary, int index) {
		List<String> tempSB = new ArrayList<String>(Arrays.asList(arrary));
		tempSB.remove(index);
		return tempSB.toArray(new String[0]);
	}*/
	
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String O[]  = new String[N];
		String temp = new String(" ");

		//���� �迭 ����
		int c=0;
		for(int i=0; i<N; i++){
			String sb = new String(sc.next());
			O[i] = sb;
		}
		
		// �ε����� ������ �ʿ� X
		/*for(int i=0; i<N; i++){
			for(int j=i+1; j<N; j++) {
				if(O[i].equals(O[j])) {
					O = removeRE(O, j); //��ġ�� �ε��� ����
					N = N-1; // �迭 ũ�� ���̱�!
				}
			}
		}*/
		
		int len = O.length;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				int s1 = O[i].length();
				int s2 = O[j].length();
				
				if(s1 > s2){
					temp = O[j];
					O[j] = O[i];
					O[i] = temp;
				}
				
				else if(s1 == s2) {
					int compared = O[i].compareTo(O[j]);
					if (compared > 0) {
						temp = O[j];
						O[j] = O[i];
						O[i] = temp;
					}
				}
			}
		}
		for(int i=0; i<len; i++){
			if(i==0) {
				System.out.println(O[i]);
			}
			else {
				int compared = O[i].compareTo(O[i-1]);
				if(compared == 0) {
					i++;
					System.out.println(O[i]);
				}
				else
					System.out.println(O[i]);
			}
		}
	}
}