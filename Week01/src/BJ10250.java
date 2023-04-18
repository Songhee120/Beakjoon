import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String[] input = br.readLine().split(" ");
			
			int h = Integer.parseInt(input[0]);
			int w = Integer.parseInt(input[1]);
			int n = Integer.parseInt(input[2]);

			int result = n / h + 1;	// 뒷부분 먼저 완성
			int num = n % h;		// 나머지
			
			// 나머지 관련 분기처리
			if(num == 0) {
				result += h * 100;
				result--;			// 완성된 뒷부분에서 1 빼주기
			} else {
				result += num * 100;
			}
			
			System.out.println(result);
		}
		
	}
}
