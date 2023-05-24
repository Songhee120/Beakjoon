import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ2164 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// 2. 큐 생성
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		// 3. 결과 도출
		while(queue.size() > 1) {
//			System.out.println("현재 queue 상태: " + queue.toString());
			queue.poll();
			queue.add(queue.poll());
		}
		System.out.println(queue.poll());
	}
}
