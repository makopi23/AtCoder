package ABC_164_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		while(true) {
			C -= B;
			if(C <= 0) {
				System.out.println("Yes");
				return;
			}
			A -= D;
			if(A <= 0) {
				System.out.println("No");
				return;
			}
		}
	}
}
