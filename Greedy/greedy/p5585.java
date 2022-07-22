package greedy;
//°Å½º¸§µ·
import java.util.*;
import java.io.*;
public class p5585 {
	static int change;
	static int count;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int price = Integer.parseInt(br.readLine());
		change = 1000-price;

		int c500 = change/500;
		change -= c500*500;
		
		int c100 = change/100;
		change -= c100*100;
		
		int c50 = change/50;
		change -= c50*50;
		
		int c10 = change/10;
		change -= c10*10;
		
		int c5 = change/5;
		change -= c5*5;
		
		count = c500 + c100 + c50 + c10 + c5 + change;
		System.out.print(count);
	}

}
