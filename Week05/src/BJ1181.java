import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class BJ1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Comparator 구현
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length()) {
					return -1;
				} else if(o1.length() > o2.length()) {
					return 1;
				} else {
					return o1.compareTo(o2);	// 두 길이가 같은 경우 사전 순
				}
			}
		};
	
		// n과 n개의 단어 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = new String(br.readLine());
		}
		
		// 정렬하기
		Arrays.sort(words, comparator);
		
		// 중복 제거하기
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(words));
		words = linkedHashSet.toArray(new String[0]);
		
		// 출력하기 
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
	}
}
