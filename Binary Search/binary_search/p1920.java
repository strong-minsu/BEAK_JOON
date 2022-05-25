package binary_search;
import java.util.*;
public class p1920 {
	
	public static int Binary_search(int[] n, int t) {
		int low = 0;
		int high = n.length - 1;
		int mid;
		
		while(low <= high) {
			
			mid = (low+high)/2;
			//���� ã�� ���
			if(n[mid] == t) 
				return 1;
			//�߰� ������ ���� ���
			else if(n[mid] > t) 
				high = mid-1;
			//�߰� ������ ū ���
			else
				low = mid+1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int N_array [] = new int[N];
		for(int i=0; i<N; i++) {
			N_array[i] = sc.nextInt();
		}
		Arrays.sort(N_array);
		
		int M = sc.nextInt();
		int M_array [] = new int[M];
		for(int i=0; i<M; i++) {
			M_array[i] = sc.nextInt();
		}
		
		for(int i=0; i<M; i++) {
			System.out.println(Binary_search(N_array, M_array[i]));
		}
	}
}
