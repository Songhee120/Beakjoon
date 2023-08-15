import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		
		// 2. 스택 쌓기
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < k; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n > 0) {
				stack.push(n);
			} else if(n == 0) {
				stack.pop();
			}
		}
		
		// 3. 총합 구하기
		int result = 0;
		for (Integer n : stack) {
			result += n;
		}
		
		// 4. 결과 출력
		System.out.println(result);
	}
}
