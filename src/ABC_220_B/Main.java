package ABC_220_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();
			
		System.out.println(revert10(K, A) * revert10(K, B));

	}
	
	public static long revert10(int K, long A) {
		long A10 = 0;
		int loop = 0;
		
		while(true) {
			A10 = A10 + (A % 10) * (int)Math.pow(K, loop);
			A = A / 10;
			loop++;
			if(A < 10) {
				A10 = A10 + (A % 10) * (int)Math.pow(K, loop);
				break;
			}
		}
		return A10;
	}
}
