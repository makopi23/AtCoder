package ABC_086_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a * b;
		
		if(c % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}

	}
}
