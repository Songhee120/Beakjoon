import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int printCnt = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			
			// 2. Print배열 생성 & 중요도 개수 확인
			Print[] prints = new Print[printCnt];
			int[] priorityCnt = new int[10];
			
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < printCnt; j++) {
				int priority = Integer.parseInt(st.nextToken());
				prints[j] = new Print(priority);
				priorityCnt[priority]++;
			}
			
			// 3. order 확인
			int index = 0;		// 현재 탐색 중인 인덱스
			int order = 0;		// 몇 번 프린트 됐는지
			int printed = -1;	// 가장 최근 프린트된 인덱스
			int highestPriority = getHighestPriority(priorityCnt, 9);
			while(target != printed) {
				index++;
				index = index % printCnt;
				// 현재 인덱스의 프린트가 아직 출력된게 아니고 가장 높은 우선 순위일 경우
				if(!prints[index].isPrinted && prints[index].priority == highestPriority) {
					order++;
					printed = index;
					highestPriority = getHighestPriority(priorityCnt, highestPriority);
				}
			}
			result.append(order + "\n");
		}
		// 4. 출력
		System.out.println(result);
	}
	
	static int getHighestPriority(int[] priorityCnt, int currentPriority) {
		for (int i = currentPriority; i > 0; i--) {
			if(priorityCnt[i] != 0) {
				priorityCnt[i]--;
				return i;
			}
		}
		return -1;
	}
	
}

// 인쇄됨 유무와 중요도를 저장하기 위한 클래스 
class Print {
	Boolean isPrinted;
	int priority;
	
	public Print(int priority) {
		isPrinted = false;
		this.priority = priority;
	} 
}
