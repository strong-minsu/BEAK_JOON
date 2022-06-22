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
				
				//자신보다 큰 값이 있는지 검사
				Iterator it = queue.iterator();
				while (it.hasNext()) {
					Document value = (Document) it.next();
					if (temp.pri < value.pri) { // 현재 문서의 우선순위보다 우선순위가 큰 문서가 있다면,
						b = false;
						break; // 이터레이터 탐색을 종료함
					}
				}

				if (b == false) { // 현재문서보다 높은 우선순위를 가진 문서를 발견했다면
					queue.add(temp); // 현재 문서를 맨 뒤로 보냄
				}
				
				else {
					if (temp.Number == M[1]) { // 현재 문서의 번호와 찾으려는 문서의 번호가 동일하다면
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
