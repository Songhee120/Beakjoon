// 이 방법으로는 풀 수가 없다... 너무 복잡해...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 2. 데이터 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Person> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			list.add(new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		// 3. 데이터 정렬하기
		ArrayList<Person> sortedList = (ArrayList<Person>) list.clone();
		Collections.sort(sortedList);
//		System.out.println(sortedList.toString());
		
		// 4. 출력하기
		StringBuilder sb = new StringBuilder();
		int rank = sortedList.indexOf(list.get(0)) + 1;
		sb.append(rank + " ");
		for (int i = 1; i < n; i++) {
			int index = sortedList.indexOf(list.get(i));
//			rank = sortedList.get(index - 1).equals(list.get(i))? rank : index + 1;
			sb.append(rank + " ");
			System.out.println(sortedList.indexOf(list.get(i)));
		}
		System.out.println(sb);
	}
	
	
}

// 1. Person 클래스 (Comparable 인터페이스 구현)
class Person implements Comparable<Person>{

	private int weight;
	private int height;
	
	public Person(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return this.height + " " + this.weight;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int compareTo(Person o) {
		if(this.weight > o.getWeight() && this.height > o.getHeight()) {
			return -1;
		} else if(this.weight < o.getWeight() && this.height < o.getHeight()) {
			return 1;
		} else {
			return 0;
		}
	}
	
}

