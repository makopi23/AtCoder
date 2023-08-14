package ABC_124_B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		
		String S[] = new String[N];
		int T[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			S[i] = sc.next();
			T[i] = sc.nextInt();
		}
		
		int TT[] = Arrays.copyOf(T, N);
		
		Arrays.sort(TT);
		
		int secondHeight = TT[N - 2];
		
		for(int i = 0; i < N; i++) {
			if(T[i] == secondHeight) {
				System.out.println(S[i]);
			}
		}
	}
}
