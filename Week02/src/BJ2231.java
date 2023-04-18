import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2231 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = 0;		// 몇 자리 수인지 저장해 둘 변수
		int temp = n;	// 임시로 사용할 변수 temp
		
		// 입력 받은 n이 몇 자리 수인지 구하기
		while(temp != 0) {
			temp /= 10;
			k++;
		}
		
		// n-9*k 부터 분해합 구하기
		temp = n - 9 * k;
		while(sum(temp, n) != n && temp < n) {
			temp++;
		}
		
		if(temp == n) {
			System.out.println("0");
		} else {
			System.out.println(temp);
		}
	}
	
	static int sum(int m, int n) {
		int result = m;
		
		while(m != 0) {
			result += m % 10;
			m /= 10;
			
			if(result > n) {
				return 0;
			}
		}
		
		return result;
	}
}
