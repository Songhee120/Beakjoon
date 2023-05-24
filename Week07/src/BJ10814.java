import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 2. 데이터 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Member> members = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			Member member = new Member(i, Integer.parseInt(st.nextToken()), st.nextToken());
			members.add(member);
		}
		
		// 3. 정렬
		Collections.sort(members);
		
		// 4. 출력
		for (int i = 0; i < n; i++) {
			System.out.println(members.get(i).getAge() + " " + members.get(i).getName());
		}
	}
}

// 1. Member 클래스 정의, Comparable 구현
class Member implements Comparable<Member>{
	private int date;	// 입력받은 순서, 즉 가입순서 의미
	private int age;
	private String name;
	
	public Member(int date, int age, String name) {
		super();
		this.date = date;
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public int compareTo(Member o) {
		// 나이가 많으면 양수 리턴
		if(this.age > o.getAge()) {
			return 1;
		}
		// 나이가 같을 때, 가입 일자가 빠르면 양수 리턴/느리면 음수 리턴
		else if(this.age == o.getAge()) {
			return this.date > o.getDate() ? 1 : -1;
		}
		// 나이가 어리면 음수 리턴
		else {
			return -1;
		}
	}
	
}
