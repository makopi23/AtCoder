package ABC_162_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		long N = sc.nextLong();
		
		long sum = 0; 
		
		for(long i = 1; i <= N; i++) {
			if(i % 3 != 0 && i % 5 != 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
