import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class BJ1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());		
		int[] sequence = new int[n];	
		
		for (int i = 0; i < n; i++) {
			sequence[i] = Integer.parseInt(br.readLine());
		}
		
		// 2. 스택 이용해 수열 만들기
		int[] sortedArr = Arrays.copyOf(sequence, n);
		Arrays.sort(sortedArr);	// 오름차순 정렬
		
		Stack<Integer> stack = new Stack<>();
		stack.add(sortedArr[0]);
		int i = 1;
		int j = 0;
		
		StringBuilder result = new StringBuilder();
		result.append("+\n");
		
		while (true) {
			// 스택이 비지않았고 스택 윗부분을 확인해보니 찾아야 하는 수와 일치
			if(!stack.isEmpty() && stack.peek() == sequence[j]) {
				stack.pop();
				j++;
				result.append("-\n");
			// 위의 경우가 아니지만 아직 스택에 쌓을 수 있는 숫자가 남아있음
			} else if(i < n) {
				stack.push(sortedArr[i]);
				i++;
				result.append("+\n");
			// 둘다 아님
			} else {
				break;
			}
		}
		
		if(j < n) {
			result = new StringBuilder("NO");
		}
		
		System.out.println(result);
	}
}
