import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ4949 {
	public static void main(String[] args) throws IOException {
		
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		while(!str.equals(".")) {
			// 2. 밸런스 확인
			Stack<Character> stack = new Stack<>();
			boolean isBalanced = true;
			
			for (Character c : str.toCharArray()) {
				// push
				if(c == '[' || c == '(') {	
					stack.push(c);
				}
				
				// pop
				if(c == ']') {	
					if(stack.empty() || stack.pop() != '[') {
						isBalanced = false;
						break;
					}
				} else if(c == ')') {	
					if(stack.empty() || stack.pop() != '(') {
						isBalanced = false;
						break;
					}
				}
			}
			
			// 3. 출력
			if(isBalanced && stack.isEmpty())
				System.out.println("yes");
			else
				System.out.println("no");
				
			// 4. 다음 입력
			str = br.readLine();
		}
		
	}
}
