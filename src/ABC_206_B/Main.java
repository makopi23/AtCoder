package ABC_206_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		
		// 貯金箱の中身
		int saving = 0;
		
		// 貯金した日数
		int days = 0;

		for(int i = 0; i < 1000000000; i++) {
			saving += i;

			if(saving >= N) {
				System.out.println(days);
				return;
			}
			
			days++;
		}

	}
}
