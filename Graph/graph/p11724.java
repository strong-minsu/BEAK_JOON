package graph;
//연결 요소의 개수
// 연결된 덩어리(?) 개수 구하기
import java.util.*;
import java.io.*;
public class p11724 {
	static int N;
	static int M;
	static int count=0;
	static LinkedList<Integer>[] graphlink;
	
	// linkedlist로 그래프 생성	
	static void graphLinkedList(int v) {
		//그래프 1부터 시작한다고 가정 (0자리는 비워둔다)
		graphlink = new LinkedList[v+1];
		for(int i=0; i<v+1; i++) {
			graphlink[i] = new LinkedList();
		}
	}
	
	//인접 노드 추가
	static void addEdge(int v1, int v2) {
		graphlink[v1].add(v2);
		graphlink[v2].add(v1);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graphLinkedList(N);
		
		int v1=0, v2=0;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			v1 = Integer.parseInt(st.nextToken());
			v2 = Integer.parseInt(st.nextToken());
			addEdge(v1, v2);
		}
		
		boolean visited[] = new boolean[N + 1];
		Arrays.fill(visited, Boolean.FALSE);
		for(int i=1; i<N+1; i++) {
			if(visited[i]) {
				continue;
			}
			else {
				//큐 요소
				int w =0;
				
				//너비 우선 탐색
				Queue<Integer> queue = new LinkedList<>();
				
				//시작 노드
				queue.add(i);
				visited[i] = true;
					
				//큐에 요소가 있을 때만 수행
				while(!queue.isEmpty()) {
					w = queue.remove();
					
					//큐에 있던 정점 탐색
					for(int j=0; j<graphlink[w].size(); j++) {
						//방문 정점의 자식 노드 가져옴
						int g_node = graphlink[w].get(j);
						//방문 전이면
						if(visited[g_node] == false) {
							//큐에 추가
							queue.add(g_node);
							//방문했음으로 표시
							visited[g_node] = true;
						}
					}
				}
				count++;
			}
		}
		System.out.print(count);
	}

}
