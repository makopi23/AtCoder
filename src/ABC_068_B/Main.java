package ABC_068_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		
		int max_kaisuu = 0;
		int max_number = 1;
		int count = 0;
		
		for(int i = 1; i <= N; i++) {
			int NN = i;
			count = 0;

			while(true) {
				if(NN % 2 == 0) {
					count++;
				}
				NN = NN / 2;
				if(NN < 2) break;
			}
			if(max_kaisuu < count) {
				max_kaisuu = count;
				max_number = i;
			}
			
		}
		System.out.println(max_number);
	}
}
