import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int zone = 1;		// 현재 존
		int roomNum = 1;	// 현재 방
		
		while(roomNum < n) {
			System.out.println("현재 존: " + zone);
			System.out.println("현재 룸: " + roomNum);
			
			roomNum += zone * 6;
			zone++;
		}
		System.out.println(zone);
	}
}
