package greedy;
//회의실 배정하기
import java.util.*;
import java.io.*;
public class p1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N  = Integer.parseInt(st.nextToken());
		int [][]array = new int [N][2];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			//0, 1 각각 시작시간, 종료시간 저장
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//정렬, 종료시각이 빠른 순으로, 만약 종료시간이 같으면 시작시간이 빠른 순
		Arrays.sort(array, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
		
		int count=0;
		int end=-1;
		for(int i=0; i<N; i++) {
			//겹치지 않은 다음 회의가 나온 경우
			if(array[i][0]>=end) {
				//종료시간 입력
				end=array[i][1];
				count++;
			}
		}
		System.out.print(count);
	}

}
