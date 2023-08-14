package ABC_130_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int L[] = new int[N];
		
		int distance = 0;
		
		int count = 1;
		
		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
			distance += L[i];
			if(distance <= X) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
