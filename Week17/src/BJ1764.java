import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BJ1764 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 듣도 못한 사람
		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		// 보도 못한 사람
		List<String> list = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			
			if(set.contains(name)) {
				list.add(name);
			}
		}
		
		// 정렬
		Collections.sort(list);
		
		
		// 출력
		StringBuilder result = new StringBuilder();
		result.append(list.size() + "\n");
		for (String name : list) {
			result.append(name + "\n");
		}
		System.out.println(result);
	}
}
