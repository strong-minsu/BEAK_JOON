package graph;
//���� ����� ����
// ����� ���(?) ���� ���ϱ�
import java.util.*;
import java.io.*;
public class p11724 {
	static int N;
	static int M;
	static int count=0;
	static LinkedList<Integer>[] graphlink;
	
	// linkedlist�� �׷��� ����	
	static void graphLinkedList(int v) {
		//�׷��� 1���� �����Ѵٰ� ���� (0�ڸ��� ����д�)
		graphlink = new LinkedList[v+1];
		for(int i=0; i<v+1; i++) {
			graphlink[i] = new LinkedList();
		}
	}
	
	//���� ��� �߰�
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
				//ť ���
				int w =0;
				
				//�ʺ� �켱 Ž��
				Queue<Integer> queue = new LinkedList<>();
				
				//���� ���
				queue.add(i);
				visited[i] = true;
					
				//ť�� ��Ұ� ���� ���� ����
				while(!queue.isEmpty()) {
					w = queue.remove();
					
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
				count++;
			}
		}
		System.out.print(count);
	}

}
