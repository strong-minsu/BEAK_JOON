package data_structure;
import java.util.*;
import java.io.*;

class Document {
	int Number; 
	int pri; 

	public Document(int Number, int pri) {
		this.Number = Number;
		this.pri = pri;
	}
}

public class p1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		
		int []M = new int[2];
		
		Queue<Document> queue = new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			sb = new StringBuilder();
			M[0] = Integer.parseInt(st.nextToken());
			M[1] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M[0]; j++) {
				int k = Integer.parseInt(st.nextToken());
				queue.add(new Document(j, k));
			}
			int count = 1;
			while(!queue.isEmpty()) {
				Document temp = queue.poll();
				boolean b = true;
				
				//�ڽź��� ū ���� �ִ��� �˻�
				Iterator it = queue.iterator();
				while (it.hasNext()) {
					Document value = (Document) it.next();
					if (temp.pri < value.pri) { // ���� ������ �켱�������� �켱������ ū ������ �ִٸ�,
						b = false;
						break; // ���ͷ����� Ž���� ������
					}
				}

				if (b == false) { // ���繮������ ���� �켱������ ���� ������ �߰��ߴٸ�
					queue.add(temp); // ���� ������ �� �ڷ� ����
				}
				
				else {
					if (temp.Number == M[1]) { // ���� ������ ��ȣ�� ã������ ������ ��ȣ�� �����ϴٸ�
						sb.append(count).append("\n");
					} else {
						count++;
					}

				}
			}
			System.out.print(sb);
		}
	}

}
