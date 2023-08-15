import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] cards = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cards);

		int m = Integer.parseInt(br.readLine());
		int[][] nums = new int[m][2];	// nums[?][0]=입력된 숫자 / nums[?][1]=카운트
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			nums[i][0] = Integer.parseInt(st.nextToken());
		}
		
		// 2. 카운트: 브루트포스
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				if(cards[j] == nums[i][0])
//					nums[i][1]++;
//			}
//		}
		
		// 2. 카운트: 이진탐색
		for (int i = 0; i < m; i++) {
			int index = binarySearch(cards, nums[i][0]);
			if(index == -1) {
				nums[i][1] = 0;
			} else {
				nums[i][1] = countNearby(cards, index);
			}
		}
		
		// 3. 출력
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			sb.append(nums[i][1] + " ");
		}
		System.out.println(sb);
	}
	
	// 이진 탐색
	public static int binarySearch(int arr[], int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == target) {
				return mid;
			} else if(arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		return -1;
	}
	
	// 주변 탐색: 같은 숫자가 주변에 몇개 있는지 리턴
	public static int countNearby(int arr[], int i) {
		int cnt = 1;

		// 왼쪽 탐색
		int j = i - 1;	// 주변 탐색할 인덱스
		while(j >= 0 && arr[j] == arr[i]) {
			cnt++;
			j--;
		}
		// 오른쪽 탐색
		j = i + 1;
		while(j < arr.length && arr[j] == arr[i]) {
			cnt++;
			j++;
		}
		
		return cnt;
	}
}
