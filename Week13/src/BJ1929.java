import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1929 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		// 2. 소수 구하기
		boolean[] isPrime = new boolean[n + 1];
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true; 
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < n + 1 && i * j <= n; j++) {
				isPrime[i * j] = false;
			}
		}
		
		// 3. 소수 출력하기
		for (int i = m ; i <= n; i++) {
			if(isPrime[i]) 
				System.out.println(i);
		}
	}
}
