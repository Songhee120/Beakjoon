import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BJ10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
			// 1. 입력: n, 명령어
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			
			// 2. 명령어 처리
			MyDeque deque = new MyDeque();
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < n; i++) {
				String command = br.readLine();
				
				switch (command.split(" ")[0]) {
				case "push_front":
					deque.push_front(Integer.parseInt(command.split(" ")[1]));
					break;
				case "push_back":
					deque.push_back(Integer.parseInt(command.split(" ")[1]));
					break;
				case "pop_front":
					result.append(deque.pop_front() + "\n");
					break;
				case "pop_back":
					result.append(deque.pop_back() + "\n");
					break;
				case "size":
					result.append(deque.size() + "\n");
					break;
				case "empty":
					result.append(deque.isEmpty() + "\n");
					break;
				case "front":
					result.append(deque.front() + "\n");
					break;
				case "back":
					result.append(deque.back() + "\n");
					break;
				default:
					break;
				}
				
				// log
				// result.append(deque.queue.toString() + "\n");
			}
			
			// 3. 결과 출력
			System.out.println(result);
			
		}
	}

	class MyDeque {
		LinkedList<Integer> queue;

		// 스택 생성자
		public MyDeque() {
			queue = new LinkedList<>();
		}
		
		// push_front X: 정수 X를 덱의 앞에 넣는다.
		public void push_front(int x) {
			queue.addFirst(x);
		}
		
		// push_back X: 정수 X를 덱의 뒤에 넣는다.
		public void push_back (int x) {
			queue.addLast(x);
		}
		
		// pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		public int pop_front() {
			if(queue.isEmpty()) {
				return -1;
			} else {
				return queue.pollFirst();
			}
		}

		// pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		public int pop_back() {
			if(queue.isEmpty()) {
				return -1;
			} else {
				return queue.pollLast();
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
		
		// front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		public int front() {
			if(queue.isEmpty()) {
				return -1;
			} else {
				return queue.getFirst();
			}
		}
		
		// back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		public int back() {
			if(queue.isEmpty()) {
				return -1;
			} else {
				return queue.getLast();
			}
		}
	}
