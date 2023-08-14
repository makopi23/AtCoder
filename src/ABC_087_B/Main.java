package ABC_087_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		
		int count = 0;
		
		for(int a = 0; a <= A; a++) {
			for(int b = 0; b <= B; b++) {
				for(int c = 0; c <= C; c++) {
					if(X == 500 * a + 100 * b + 50 * c) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
		
	}
}
