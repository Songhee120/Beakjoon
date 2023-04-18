import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());	// 테스트 케이스 개수
		
		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			// 배열 초기화
			int[][] arr = new int[k + 1][n + 1];
			for (int j = 0; j < k + 1; j++) {	// 세로 초기화
				arr[j][1] = 1;
			}
			for (int j = 1; j < n + 1; j++) {	// 가로 초기화
				arr[0][j] = j;
			}
			
			
			for (int j = 1; j < k + 1; j++) {
				for (int j2 = 2; j2 < n + 1; j2++) {
					arr[j][j2] = arr[j - 1][j2] + arr[j][j2 - 1];
//					System.out.println(arr[j - 1][j2] + " " + arr[j][j2 - 1] + " ");
//					System.out.println(arr[j][j2] + " ");
				}
			}
			System.out.println(arr[k][n]);
		}
	}
}
