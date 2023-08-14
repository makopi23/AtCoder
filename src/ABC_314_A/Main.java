package ABC_314_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		
		String PI = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
		
		System.out.println(PI.substring(0, N + 2));
	}
}
