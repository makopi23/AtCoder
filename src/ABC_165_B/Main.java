package ABC_165_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		long X = sc.nextLong();
		
		long price = 100;
		
		for(int i = 1; true; i++) {
			//price = (long)Math.floor(price * 1.01);
			price += price / 100;
			if(price >= X) {
				System.out.println(i);
				return;
			}
		}
	}
}
