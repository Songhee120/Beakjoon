import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BJ10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 입력: n, 명령어
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// 2. 명령어 처리
		MyQueue queue = new MyQueue();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String command = br.readLine();
			
			switch (command.split(" ")[0]) {
			case "push":
				queue.push(Integer.parseInt(command.split(" ")[1]));
				break;
			case "pop":
				result.append(queue.pop() + "\n");
				break;
			case "size":
				result.append(queue.size() + "\n");
				break;
			case "empty":
				result.append(queue.isEmpty() + "\n");
				break;
			case "front":
				result.append(queue.front() + "\n");
				break;
			case "back":
				result.append(queue.back() + "\n");
				break;
			default:
				break;
			}
		}
		
		// 3. 결과 출력
		System.out.println(result);
		
	}
}

class MyQueue {
	LinkedList<Integer> queue;

	// 스택 생성자
	public MyQueue() {
		queue = new LinkedList<>();
	}
	
	// push X: 정수 X를 스택에 넣는 연산이다.
	public void push(int x) {
		queue.add(x);
	}
	
	// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int pop() {
		if(queue.isEmpty()) {
			return -1;
		} else {
			return queue.poll();
		}
	}
	
	// size: 스택에 들어있는 정수의 개수를 출력한다.
	public int size() {
		return queue.size();
	}
	
	// empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	public int isEmpty() {
		return queue.isEmpty()? 1 : 0;
	}
	
	// front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int front() {
		if(queue.isEmpty()) {
			return -1;
		} else {
			return queue.getFirst();
		}
	}
	
	// back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int back() {
		if(queue.isEmpty()) {
			return -1;
		} else {
			return queue.getLast();
		}
	}
}