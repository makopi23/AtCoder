package ABC_201_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		
		int H[] = new int[N];
		
		int count = 1;
		
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i; j++) {
				if(H[i] < H[j]) {
					break;
				}
				if(j == i - 1) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
