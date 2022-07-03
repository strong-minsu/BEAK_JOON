package graph;
import java.util.*;
import java.io.*;
public class p2606 {
	private static LinkedList<Integer>[] graphlink;
	
	//linkedlist로 그래프 생성
	public static void graphLinkedList(int v) {
		graphlink = new LinkedList[v+1];
		
		for(int i=0; i<v+1; i++) {
			graphlink[i] = new LinkedList();
		}
	}
	// 생성한 그래프에 간선 추가
	public static void addEdge(int v1, int v2) {
		graphlink[v1].add(v2);
		graphlink[v2].add(v1);
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		graphLinkedList(N);
		int v1, v2;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			v1 = Integer.parseInt(st.nextToken());
			v2 = Integer.parseInt(st.nextToken());
			addEdge(v1, v2);
		}
		//탐색한 정점 구별을 위해 배열 선언
		boolean visited[] = new boolean[N + 1];
		Arrays.fill(visited, Boolean.FALSE);
		
		//큐 요소
		int w =0;
		
		//너비 우선 탐색
		Queue<Integer> queue = new LinkedList<>();
		
		//시작 노드
		queue.add(1);
		visited[1] = true;
		
		//시작 정점 제외하고 정점 개수를 세는 cont변수
		int count =-1;
		
		//큐에 요소가 있을 때만 수행
		while(!queue.isEmpty()) {
			w = queue.remove();
			count++;
			
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
		System.out.println(count);
	}
}
