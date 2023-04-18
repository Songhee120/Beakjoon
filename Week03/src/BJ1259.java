import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		do {
			boolean flag = true;
			
			for (int i = 0; i < str.length() / 2; i++) {
				if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
			str = br.readLine();
			
		} while (!str.equals("0"));
		
		
	}
}
