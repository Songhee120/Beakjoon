import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2108_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[8001];	// 배열에는 각 숫자(인덱스)의 빈도를 저장
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			
			int input = Integer.parseInt(br.readLine());
			nums[input + 4000]++;
			
			if(input > max) {
				max = input;
			}
			
			if(input < min) {
				min = input;
			}
			
			sum += input;
		}
		
		// 2. 계산: 산술평균, 중앙값, 최빈값, 범위
		int cnt = 0;
		int mid = min;
		int mode = min;
		int maxFreq = 0;
		Boolean first = false;
		
		for (int i = min + 4000; i <= max + 4000; i++) {
			if(nums[i] > 0) {
				
				// 중앙값
				if(cnt <= N / 2) {
					cnt += nums[i];
					mid = i - 4000;
				}
				
				// 최빈값
				if(nums[i] > maxFreq) {
					mode = i - 4000;
					first = true;
					maxFreq = nums[i];
				} else if(nums[i] == maxFreq && first) {
					mode = i - 4000;
					first = false;
				}
			}
		}
		
		int avg = (int)Math.round((double)sum / N);	// 산술평균
		int range = max - min;	// 범위
		
		System.out.println(avg + "\n" + mid + "\n" + mode + "\n" + range);
		
	}
}
