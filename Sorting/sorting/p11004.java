package sorting;
import java.util.*;
import java.io.*;

//quick sort 이용 문제
public class p11004 {
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void quickSort(int A[], int low, int high, int k) {
		if(low < high) {
			int pivot = partition(A, low, high);
			if(pivot == k) 
				return;
			
			else if(k < pivot)
				quickSort(A, low, pivot-1, k);
			else
				quickSort(A, pivot+1, high, k);
		}
	}
	
	public static int partition(int A[], int low, int high) {
		int i, j;
		int M = (low+high)/2;
		swap(A, low, M);
		int pivot = A[low];
		i = low;
		j = high;
		
		while(i < j) {
			while(pivot < A[j]) {
				j--;
			}
			while(i < j && pivot >= A[i]) {
				i++;
			}
			swap(A, i, j);
		}
		A[low] = A[i];
		A[i] = pivot;
		return i;
	}
	
	//main 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int [] A = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		quickSort(A, 0, N-1, K-1);
		System.out.print(A[K-1]);
		//		bw.write(String.valueOf(A[K-1]));

	}
}

/*
 import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(list);

		bw.write(String.valueOf(list.get(target - 1)));

		br.close();
		bw.close();
	}
}*/
