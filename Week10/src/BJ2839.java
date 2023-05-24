import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// 2. 계산
		int m = n / 5;	// n을 5로 나눈 몫
		int result = -1;
		for (int i = m; i >= 0; i--) {
			if((n - i * 5) % 3 == 0) {
				result = i + ((n - i * 5) / 3);
				break;
			}
		}
		System.out.println(result);
	}
}
