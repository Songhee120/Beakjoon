import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BJ1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// n 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// boolean 타입 배열에 해당 수가 소수인지(true) 아닌지(false) 저장
		boolean isPrime[] = new boolean[1001];
		isPrime[1] = false;
		for (int i = 2; i <= 1000; i++) {
			isPrime[i] = isPrime(i);
		}

		// n개 자연수 입력 받으면서 소수 개수 카운트
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
	
			if(isPrime[num]) {
				cnt++;
			}
		}
		// 내 코드
		// (소수 n) + (상수 시간)
		
		// 너 코드
		// (상수 시간) * (소수 n) 
		
		System.out.println(cnt);
	}
	
	// 소수 판별하는 함수
	static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if(num % i == 0) 
				return false;
		}
		return true;
	}
}
