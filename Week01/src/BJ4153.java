import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String[] input = br.readLine().split(" ");
			int nums[] = new int[3];
			
			nums[0] = Integer.parseInt(input[0]);
			nums[1] = Integer.parseInt(input[1]);
			nums[2] = Integer.parseInt(input[2]);
			
			Arrays.sort(nums);
			
			if(nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
				break;
			} else if(nums[0] * nums[0] + nums[1] * nums[1] == nums[2] * nums[2]) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}

//		System.out.println("프로그램 종료");
	}
}
