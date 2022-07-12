package implementation;
import java.util.*;
import java.io.*;

public class p1475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Number = br.readLine();
		
		ArrayList<Integer> plastic_number = new ArrayList<Integer>();
		for(int i=0; i<9; i++) {
			plastic_number.add(i);
			if(i==6) {
				plastic_number.add(i);
			}
		}
		
		int count=1;
		for(int i=0; i<Number.length(); i++) {
			int n = Number.charAt(i)-'0';
			if(n == 9) {
				n=6;
			}
			if(plastic_number.contains(n)) {
				int index = plastic_number.indexOf(n);
				plastic_number.remove(index);
			}
			else {
				count++;
				for(int j=0; j<9; j++) {
					if(j != n) {
						plastic_number.add(j);
						if(j == 6)
							plastic_number.add(j);
					}
				}
				if(n == 6) {
					plastic_number.add(6);
				}
			}
		}
		System.out.print(count);
	}

}
