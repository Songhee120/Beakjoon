import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1018 {
	public static void main(String[] args) throws IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Boolean[][] arr = new Boolean[n][m];
		// white는 true로 black은 false로
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = input.charAt(j) == 'w' ? true : false;
			}
		}
		
		// 2. 최소값 구하기
		int min = 100;
		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for (int k = i; k < i + 8; k++) {
					boolean flag1 = k % 2 == 0 ? true : false;
					boolean flag2 = k % 2 == 0 ? false : true;
					for (int l = j; l < j + 8; l++) {
						cnt1 = arr[k][l] == flag1 ? cnt1 : cnt1 + 1;
						cnt2 = arr[k][l] == flag2 ? cnt2 : cnt2 + 1;
						flag1 = !flag1;
						flag2 = !flag2;
					}
				}
				System.out.println("cnt1은 " + cnt1 + ", cnt2는 " + cnt2);
				min = Integer.min(Integer.min(min, cnt1), cnt2);
				System.out.println("현재 min값: " + min);
			}
		}
		System.out.println("최종 min값: " + min);
		
		
		
	}
}
