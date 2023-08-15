import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1654 {
	
	static int[] cables;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		cables = new int[K];
		long sum = 0;
		for (int i = 0; i < K; i++) {
			cables[i] = Integer.parseInt(br.readLine());
			sum += cables[i];
		}
		
		// 2. 이진 탐색
		long start = 1;
		long end = sum / N;
		
		while(start + 1 < end) {
			
			long mid = end - (end - start) / 2;
		
			if(check(mid)) {
				start = mid;
			} else {
				end = mid;
			}
		}
		
		start = check(end)? end: start;
		
		// 3. 결과 출력
		System.out.println(start);
	}
	
	static boolean check(long length) {

		int cnt = 0;
		for (int cable : cables) {
			cnt += cable / length;
		}
		
		return cnt >= N;
	}
	
}
