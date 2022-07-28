package graph;
import java.util.*;
import java.io.*;
//�丶��

//�丶�� ť�� type
// �丶�� ť�� ��ġ ������ �ʿ���
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
	
	//���� 0=��, 1=����, 2=�Ʒ�, 3=������
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };
	
	//bfs �Լ� 
	static void bfs(int[][] tomato) {
		Queue<Location> queue = new LinkedList<Location>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				// 1�� �κ� ���� queue�� add
				if(tomato[i][j] == 1) {
					//j=> x ��ġ, i=> y��ġ
					queue.add(new Location(j, i));
				}
			}
		}
		
		while(!queue.isEmpty()) {
			Location location = queue.poll();

			for(int i=0; i<4; i++) {
				// ���� ��ġ x, y ����
				int x_loc = location.x + dx[i];
				int y_loc = location.y + dy[i];
				
				// ��ȿ�� ��ġ���� �˻�
				if(x_loc<0 || y_loc<0 || y_loc >= N || x_loc >= M) {
					// ��ȿ���� ���� ��ġ�Ͻ� �������� �Ѿ
					continue;
				}
				
				// ���� ��ġ�� ���� ���� �丶������ �˻�
				if(tomato[y_loc][x_loc] !=0) {
					// ���� ��ġ�� ���� �丶�� Ȥ�� �丶�䰡 ���� (-1)��ġ�� ��� �������� �Ѿ
					continue;
				}
			
				//�ִ� �ϼ��� ���ϱ� ������ 1�� �ٲٴ� ���� �ƴ϶� ���� �ϼ� +1 => �������� ������ �� �������� max������ day�� ���Ѵ�.
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
//		visit = new boolean[N][M];	// �ʱⰪ => false
		
		//�丶�� ���� �ֱ�
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

