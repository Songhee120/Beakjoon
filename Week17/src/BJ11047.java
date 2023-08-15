import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11047 {
	public static void main(String[] args) throws IOException {
		
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coins = new int[n];
		for (int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		// 2. 동전 선택
		int i = n - 1;	// 가장 최근 선택한 코인 위치 저장
		int cnt = 0;	// 사용한 코인 개수
		
		while(k > 0) {
			if(k >= coins[i]) {
				k -= coins[i];
				cnt++;
			} else {
				i--;
			}
		}
		
		// 3. 결과 출력
		System.out.println(cnt);
	}
}
