package ABC_153_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int H = sc.nextInt();
		int A = sc.nextInt();

		int count = H / A;
		
		if(H % A == 0) {
			System.out.println(count);
		}else {
			System.out.println(count + 1);
		}

	}
}
