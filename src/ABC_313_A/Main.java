package ABC_313_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		
		int P[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		
		int max_addition = 0;
		
		for(int i = 1; i < N; i++) {
			if(P[0] <= P[i]) {
				int addition = P[i] - P[0] + 1;
				if(max_addition < addition) {
					max_addition = addition;
				}
			}
		}
		
		System.out.println(max_addition);
	}
}
