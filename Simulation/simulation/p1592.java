package simulation;

import java.util.Scanner;

//Youngsik and friends
import java.util.*;

public class p1592 {
	public static int c;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); 
		int M = scanner.nextInt(); 
		int L = scanner.nextInt(); 
		c = 0;
		
		int C[] = new int[N];
		for (int i=0; i<N; i++) {
			if(i==0) {
				C[i] = 1;
			}
			else
				C[i] = 0;
		}
		int num = 0;
		while(true) {
			if(C[num] == M) {
				break;
			}
			else {
				if(C[num] % 2 == 1) {
					num = (num+N-L) % N;
					C[num] += 1;
					c++;
				}
				else {
					num = (num+N+L) % N;
					C[num] += 1;
					c++;
				}
			}
		}
		System.out.print(c);
	}
}
