import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BJ11723_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			int n = 0;
			if(command.equals("add") || command.equals("remove") || command.equals("check") || command.equals("toggle")) {
				n = Integer.parseInt(st.nextToken());
			}
			
			switch (command) {
			case "add":
				set.add(n);
				break;
			case "remove":
				set.remove(n);
				break;
			case "check":
				if(set.contains(n)) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
			case "toggle":
				if(set.contains(n)) {
					set.clear();
				} else {
					set.add(n);
				}
				break;
			case "all":
				for (int j = 1; j <= 20; j++) {
					set.add(j);
				}
				break;
			case "empty":
				set.removeAll(set);
				break;
			default:
				break;
			}
			
			
		}
	}
}
