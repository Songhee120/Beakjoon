import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < t; i++) {
			// 2. 스택 사용해서 VPS인지 아닌지 확인
			String str = br.readLine();
			Stack<Character> stack = new Stack<>();
			Boolean isVPS = true;
			
			for (Character c : str.toCharArray()) {
				if(c == '(') {				// '(' 들어온 경우
					stack.push(c);
				} else if(stack.empty()){	// ')' 들어온 경우 && 스택이 비어있는 경우
					isVPS = false;
					break;
				} else {					// ')' 들어온 경우 && 스택에 데이터 있는 경우
					stack.pop();
				}
			}
			if(!stack.empty()) {	// 반복이 끝났지만 스택에 데이터가 남아있는 경우
				isVPS = false;
			}
			
			// 3. 결과값 StringBuilder에 저장
			if(isVPS) {
				result.append("YES\n");
			} else {
				result.append("NO\n");
			}
		}
		
		// 4. 한번에 출력
		System.out.println(result);
	}
}
