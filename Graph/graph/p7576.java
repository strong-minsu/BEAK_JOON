package graph;
import java.util.*;
import java.io.*;
//토마토

//토마토 큐의 type
// 토마토 큐에 위치 정보가 필요함
class Location{
	int x;
	int y;
	Location(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class p7576 {
	static int day;
	static int [][] tomato;
//	static boolean [][] visit;
	static int M, N;
	
	//방향 0=위, 1=왼쪽, 2=아래, 3=오른쪽
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };
	
	//bfs 함수 
	static void bfs(int[][] tomato) {
		Queue<Location> queue = new LinkedList<Location>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				// 1인 부분 전부 queue에 add
				if(tomato[i][j] == 1) {
					//j=> x 위치, i=> y위치
					queue.add(new Location(j, i));
				}
			}
		}
		
		while(!queue.isEmpty()) {
			Location location = queue.poll();

			for(int i=0; i<4; i++) {
				// 다음 위치 x, y 설정
				int x_loc = location.x + dx[i];
				int y_loc = location.y + dy[i];
				
				// 유효한 위치인지 검사
				if(x_loc<0 || y_loc<0 || y_loc >= N || x_loc >= M) {
					// 유효하지 않은 위치일시 다음으로 넘어감
					continue;
				}
				
				// 다음 위치가 익지 않은 토마토인지 검사
				if(tomato[y_loc][x_loc] !=0) {
					// 다음 위치가 익은 토마토 혹은 토마토가 없는 (-1)위치일 경우 다음으로 넘어감
					continue;
				}
			
				//최대 일수를 구하기 때문에 1로 바꾸는 것이 아니라 현재 일수 +1 => 누적으로 저장한 후 마지막에 max값으로 day를 구한다.
                tomato[y_loc][x_loc] = tomato[location.y][location.x] + 1;
                queue.add(new Location(x_loc, y_loc));
			}
		}
		day = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(tomato[i][j] == 0) {
					day=-1;
					return;
				}
				day = Math.max(day, tomato[i][j]);
			}
		}
		day --;
		return;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		tomato = new int[N][M];
//		visit = new boolean[N][M];	// 초기값 => false
		
		//토마토 정보 넣기
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				tomato[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bfs(tomato);
		System.out.print(day);
	}

}

