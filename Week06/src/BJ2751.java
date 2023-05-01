import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1. n과 n개의 정수 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		// 2. 정렬하기
		Collections.sort(list);
		
		// 3. 출력하기
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st.append(list.get(i)).append("\n");
		}
		System.out.println(st);
	}
}
