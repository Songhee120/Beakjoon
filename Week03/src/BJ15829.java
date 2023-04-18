import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ15829 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		String str = br.readLine();

		// 결과값 계산
		Long result = (long) 0;
		
		for (int i = 0; i < l; i++) {
			result += (str.charAt(i) - 'a' + 1) * power(i);
			result %= 1234567891;
		}
		
		System.out.println(result);
	}
	
	static Long power(int n) {
		Long m = (long) 1;
		for (int i = 0; i < n; i++) {
			m *= 31;
		}
		return m % 1234567891;
	}
}
