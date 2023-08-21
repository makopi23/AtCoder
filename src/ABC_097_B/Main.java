package ABC_097_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int X = sc.nextInt();
		
		int max = 0;
		
		for(int b = 1; b < 1000; b++) {
			for(int p = 2; p < 10; p++) {
				int num = (int)Math.pow(b, p);
				if(num > max && num <= X) {
					max = num;
				}
			}
		}
		
		System.out.println(max);
		
	}
}
