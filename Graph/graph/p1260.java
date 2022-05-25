package graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p1260 { 
	private static LinkedList<Integer>[] graphlink;
	
	//링크드 리스트로 그래프 생성
	public static void graphLinkedList(int v) {
		//그래프 1부터 시작한다고 가정 (0자리는 비워둔다)
		graphlink = new LinkedList[v+1];
		
		for(int i=0; i<v+1; i++) {
			graphlink[i] = new LinkedList();
		}
	}
	
	//인접 노드 추가
	public static void addEdge(int v1, int v2) {
		graphlink[v1].add(v2);
		graphlink[v2].add(v1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bfReader = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stTokenizer = 
				new StringTokenizer(bfReader.readLine());
		//정점수
		int N = Integer.parseInt(stTokenizer.nextToken());
		//간선수
		int M = Integer.parseInt(stTokenizer.nextToken());
		//방문 시작 정점
		int V = Integer.parseInt(stTokenizer.nextToken());
		
		//그래프 생성
		graphLinkedList(N);
		int v1=0, v2=0;
		
		for(int i=0; i<M; i++) {
			stTokenizer = 
					new StringTokenizer(bfReader.readLine());
			v1 = Integer.parseInt(stTokenizer.nextToken());
			v2 = Integer.parseInt(stTokenizer.nextToken());
			addEdge(v1, v2);
		}
		
		// 그래프 확인용 출력
		/*for(int i=1; i<graphlink.length; i++) {
			System.out.println("node "+i+"의  인접 노드: "+ graphlink[i]);
		}*/
		
		//DFS
		Stack<Integer> stack = new Stack<>();
		stack.push(V);
		//방문여부 검사
		boolean visited[] = new boolean[N + 1];
		Arrays.fill(visited, Boolean.FALSE);
		int w =0;
		
		//스택에 요소가 있을 때만 수행
		while(!stack.empty()) {
			w = stack.pop();
			if(!visited[w]) {
				System.out.print(w + " ");
				visited[w] = true;
				for(int j=0; j<graphlink[w].size(); j++) {
					Collections.sort(graphlink[w], Collections.reverseOrder());
					int g_node = graphlink[w].get(j);
					
					if(visited[g_node] == false) {
						stack.push(g_node);
					}
				}
			}
		}
		System.out.println();
		
		//BFS
		Queue<Integer> queue = new LinkedList<>();
		queue.add(V);
		visited = new boolean[N + 1];
		Arrays.fill(visited, Boolean.FALSE);
		visited[V] = true;
		w =0;
			//스택에 요소가 있을 때만 수행
		while(!queue.isEmpty()) {
			w = queue.remove();
			System.out.print(w + " ");
			
			for(int j=0; j<graphlink[w].size(); j++) {
				Collections.sort(graphlink[w]);
				int g_node = graphlink[w].get(j);
				if(visited[g_node] == false) {
					queue.add(g_node);
					visited[g_node] = true;
				}
			}
		}
	}
}
