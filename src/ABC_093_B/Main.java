package ABC_093_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力

		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i = A; i <= B; i++) {
			if((i < A + K || i > B - K) && i <= B) {
				System.out.println(i);
			}
		}
	}
}
