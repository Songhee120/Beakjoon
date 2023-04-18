import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int days = 0;
		int height = 0;

//		while(height < v) {
//			days++;
//			height += a;
//			if(height < v) {
//				height -= b;
//			}
//		}

		v -= a;
		days = v / (a - b);
		
		System.out.println(days);
	}
}
