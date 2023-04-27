import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int series = 1;
		int name = 666;
		while(series != n) {
			name++;
			if(String.valueOf(name).contains("666")) {
				series++;
			}
		}
		System.out.println(name);
	}
}
