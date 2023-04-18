import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2798 {
	public static void main(String[] args) throws IOException {
		// 1) n, m, 카드 배열 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2) combination 함수 사용하는 반복문 돌리기, 기준값은 m부터 시작해서 작아져야 함
        boolean[] visited = new boolean[n];
        boolean[] flag = new boolean[1];
        int i;
        for (i = m; i > m - 10; i--) {
        	System.out.println("***현재 기준 값: " + i);
        	
            if(combination(arr, visited, 0, n, 3, i, flag)) 
            	break;
        }
        
        System.out.println(i);
    }

	// 3) 기준값(m) 또한 파라미터로 같이 전달 받아서 선택한 수의 합이 m과 같으면 true 리턴 
    // 사용 예시 : combination(arr, visited, 0, n, r, m)
    static boolean combination(int[] arr, boolean[] visited, int start, int n, int r, int m, boolean[] flag) {
        if (r == 0) {
        	int sum = 0;
        	for (int i = 0; i < visited.length; i++) {
        		if(visited[i]) { 
        			System.out.printf("arr[%d]: %d\n", i, arr[i]);
        			sum += arr[i];
        		}
        	}
        	
        	System.out.printf("sum: %d, m: %d\n\n", sum, m);
        	// 모든 반복이 끝나는 지점
        	if(sum == m) {
        		flag[0] = true;
        	}
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, m, flag);
            visited[i] = false;
            
            if(flag[0]) {
            	break;
            }
        }
        
        return flag[0];
    }

}
