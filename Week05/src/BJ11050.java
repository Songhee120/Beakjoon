import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		System.out.println(binomialCoefficient(n, k));
	}
	
	static int factorial(int n) {
		return n > 1 ? n * factorial(n - 1) : 1; 
	}
	
	static int binomialCoefficient(int n, int k) {
		return k < 0 || k > n ? 0 : factorial(n) / (factorial(k) * factorial(n - k));
	}
}
