import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] waiting = new int[n];
		for (int i = 0; i < n; i++) {
			waiting[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2. 최솟값 계산
		Arrays.sort(waiting);
		
		int sum = 0;	// 누적값
		int total = 0;	// 누적값의 합산 값, 즉 최종 값
		
		for (int i : waiting) {
			sum += i;
			total += sum;
		}
		
		// 3. 결과 출력
		System.out.println(total);
		
		
	}
}
