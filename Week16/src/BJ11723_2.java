import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11723_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder result = new StringBuilder();
		
		int bitset = 0;
		
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			int num = 0;
			if(command.equals("add") || command.equals("remove") || command.equals("check") || command.equals("toggle")) {
				num = Integer.parseInt(st.nextToken());
			}

			switch (command) {
			case "add":
				bitset |= (1 << (num - 1));
				break;
			case "remove":
				bitset &= ~(1 << (num - 1));
				break;
			case "check":
				result.append((bitset & (1 << (num - 1))) != 0? "1\n" : "0\n");
				break;
			case "toggle":
				bitset ^= (1 << (num - 1));
				break;
			case "all":
				bitset |= (~0);
				break;
			case "empty":
				bitset = 0;
				break;
			}
		}
		
		System.out.println(result);
		
		
	}
}
