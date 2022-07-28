package graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//dfs다시..하기..

public class p1012 {
	static int worm =0;
	static int [][] cabbage;
	static boolean [][] visit;
	static int M, N, K;
	//방향 0=위, 1=왼쪽, 2=아래, 3=오른쪽
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };

	static void dfs(int x, int y) {
		visit[y][x] = true;

		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];

			if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
				if (!visit[cy][cx] && cabbage[cy][cx] == 1) {
					dfs(cx, cy);
				}
			}

		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stTokenizer = 
				new StringTokenizer(bfReader.readLine());
		int T = Integer.parseInt(stTokenizer.nextToken());
		
		for(int t = 0; t<T; t++) {
			worm = 0;
			stTokenizer = new StringTokenizer(bfReader.readLine());
			M = Integer.parseInt(stTokenizer.nextToken());
			N = Integer.parseInt(stTokenizer.nextToken());
			K = Integer.parseInt(stTokenizer.nextToken());
			cabbage = new int[N][M];
			visit = new boolean[N][M];
			
			//지렁이 넣기..
			for(int i=0; i<K; i++) {
				stTokenizer = new StringTokenizer(bfReader.readLine());
				int x1 = Integer.parseInt(stTokenizer.nextToken());
				int y1 = Integer.parseInt(stTokenizer.nextToken());
				cabbage[y1][x1] = 1;
			}
			
			for (int x = 0; x < M; x++) {
				for (int y = 0; y < N; y++) {
					if (cabbage[y][x] == 1 && !visit[y][x]) {
						dfs(x, y);
						worm++;
					}
				}
			}
			System.out.println(worm);
		}
	}

}
