package graph;
import java.util.*;
import java.io.*;
public class p2606 {
	private static LinkedList<Integer>[] graphlink;
	
	//linkedlist�� �׷��� ����
	public static void graphLinkedList(int v) {
		graphlink = new LinkedList[v+1];
		
		for(int i=0; i<v+1; i++) {
			graphlink[i] = new LinkedList();
		}
	}
	// ������ �׷����� ���� �߰�
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
		//Ž���� ���� ������ ���� �迭 ����
		boolean visited[] = new boolean[N + 1];
		Arrays.fill(visited, Boolean.FALSE);
		
		//ť ���
		int w =0;
		
		//�ʺ� �켱 Ž��
		Queue<Integer> queue = new LinkedList<>();
		
		//���� ���
		queue.add(1);
		visited[1] = true;
		
		//���� ���� �����ϰ� ���� ������ ���� cont����
		int count =-1;
		
		//ť�� ��Ұ� ���� ���� ����
		while(!queue.isEmpty()) {
			w = queue.remove();
			count++;
			
			//ť�� �ִ� ���� Ž��
			for(int j=0; j<graphlink[w].size(); j++) {
				//�湮 ������ �ڽ� ��� ������
				int g_node = graphlink[w].get(j);
				//�湮 ���̸�
				if(visited[g_node] == false) {
					//ť�� �߰�
					queue.add(g_node);
					//�湮�������� ǥ��
					visited[g_node] = true;
				}
			}
		}
		System.out.println(count);
	}
}
