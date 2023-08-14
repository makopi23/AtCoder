package ABC_086_C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		
		List<Travel> travelList = new ArrayList<Travel>();
		
		int t;
		int x;
		int y;

		for(int i = 1; i <= N; i++) {
			t = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			travelList.add(new Travel(t, x, y));
		}
		
		for(Travel travel : travelList) {
			t = travel.t;
			x = travel.x;
			y = travel.y;
			
			int a = t - x - y;
			
			if(a < 0 || a % 2 != 0) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
		return;
		

	}
	
	
}

class Travel{
	int t;
	int x;
	int y;
	
	Travel(int t, int x, int y){
		this.t = t;
		this.x = x;
		this.y = y;
	}
}
