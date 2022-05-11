package sorting;
import java.io.*;
import java.util.*;

//time out
public class p1181{
	public static String[] removeRE(String[] arrary, int index) {
		List<String> tempSB = new ArrayList<String>(Arrays.asList(arrary));
		tempSB.remove(index);
		return tempSB.toArray(new String[0]);
	}
	
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String O[]  = new String[N];
		String temp = new String(" ");

		//문자 배열 저장
		int c=0;
		for(int i=0; i<N; i++){
			String sb = new String(sc.next());
			O[i] = sb;
		}
		
		for(int i=0; i<N; i++){
			for(int j=i+1; j<N; j++) {
				if(O[i].equals(O[j])) {
					O = removeRE(O, j); //겹치는 인덱스 삭제
					N = N-1; // 배열 크기 줄이기!
				}
			}
		
		}
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
			System.out.println(O[i]);
		}
	}
}