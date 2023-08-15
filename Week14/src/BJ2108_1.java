import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BJ2108_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		// 2. 계산
		StringBuilder result = new StringBuilder();
		
		// 산술평균
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		
		int avg = (int)Math.round((double)sum / n);
		result.append(avg + "\n");
		
		// 중앙값
		Arrays.sort(nums);
		result.append(nums[n/2] + "\n");
	
        // 최빈값
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int mode = 0;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            int count = countMap.get(num);
            if (count > maxCount) {
                maxCount = count;
                mode = num;
            } else if (count == maxCount && num < mode) {
                mode = num;
            }
        }
        result.append(mode).append("\n");
		
		// 범위
		int range = nums[n - 1] - nums[0];
		result.append(range);
		
		// 3. 출력
		System.out.println(result);
	}
}
