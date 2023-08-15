import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ1620 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// 1. 도감 데이터 입력받기
		HashMap<Integer, String> map1 = new HashMap<>();	// 숫자로 문자찾기
		HashMap<String, Integer> map2 = new HashMap<>();	// 문자로 숫자찾기

		for (int i = 1; i <= n; i++) {
			String input = br.readLine(); 
			map1.put(i, input);
			map2.put(input, i);
		}

		// 2. 시험
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < m; i++) {
			String input = br.readLine();

			try {
				int num = Integer.parseInt(input);
				result.append(map1.get(num) + "\n");
			} catch(NumberFormatException e) {
				result.append(map2.get(input) + "\n");
			}
		}
		
		System.out.println(result);
	}
}
