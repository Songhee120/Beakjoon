import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class BJ1085 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int w = Integer.parseInt(input[2]);
		int h = Integer.parseInt(input[3]);
		
		int distance1 = w - x;	 
		int distance2 = h - y;
		
		int result = Math.min(distance1, distance2);	
		result = Math.min(result, x);
		result = Math.min(result, y);
		
		System.out.println(result);
		
	}
}

