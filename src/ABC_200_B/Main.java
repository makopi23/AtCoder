package ABC_200_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		long N = sc.nextLong();
		int K = sc.nextInt();
		
		for(int i = 0; i < K; i++) {
			if(N % 200 == 0) {
				N /= 200;
			}else {
				N = Long.parseLong(Long.toString(N) + "200");
			}
		}
		System.out.println(N);
	}
}
