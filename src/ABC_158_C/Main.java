package ABC_158_C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int yen = 1;
		
		while(true) {
			int A_tax = (int)(yen * 0.08);
			int B_tax = (int)(yen * 0.1);
			if(A_tax == A && B_tax == B) {
				System.out.println(yen);
				return;
			}
			yen++;
			
			if(A_tax > A && B_tax > B) {
				System.out.println("-1");
				return;
			}
		}
	}
}
