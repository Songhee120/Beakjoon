import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BJ18110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> levels = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			levels.add(Integer.parseInt(br.readLine()));
		}
		
		// 2. 정렬 및 원소 삭제
		levels.sort(null);
		int trimAmout = (int) Math.round(n * 0.15);
		for (int i = 0; i < trimAmout; i++) {
			levels.removeFirst();
			levels.removeLast();
		}
		
		// 3. 평균 계산과 결과 출력
		int sum = 0;
		for (Integer level : levels) {
			sum += level;
		}
		int avg = (int) Math.round((double)sum / levels.size());
		System.out.println(avg);
	}
}
