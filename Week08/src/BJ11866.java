import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ11866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. n, k 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// 2. 큐 생성
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
	
		// 3. 요세푸스 순열 출력
		LinkedList<Integer> linkedList = new LinkedList<>();
		while(!queue.isEmpty()) {
			// 큐에서 값을 빼고 다시 넣는 것을 k-1번 반복
			for (int i = 0; i < k - 1; i++) {
				queue.add(queue.poll());
			}
			// 리스트에 값 넣기
			linkedList.add(queue.poll());
		}
		String result = linkedList.toString();
		result = result.replace('[','<').replace(']', '>');
		System.out.println(result);
	}
}
