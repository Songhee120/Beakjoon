import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2798_bruteForce {
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
		
		// 2) Brute Force
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
//			int sum = arr[i];
//			if(sum > m) continue;
			
			for (int j = i + 1; j < arr.length; j++) {
//				sum += arr[j];
//				if(sum > m) continue;

				for (int k = j + 1; k < arr.length; k++) {
					int sum = arr[i] + arr[j] + arr[k];

//					System.out.printf("i:%d, j:%d, k:%d\n", i, j, k);
//					System.out.printf("%d + %d + %d = %d\n\n", arr[i], arr[j], arr[k], sum);
					
					// 3) max 갱신
					if(sum == m) {
						System.out.println(m);
						return;
					} else if(sum < m && sum > max) {
						max = sum;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}
