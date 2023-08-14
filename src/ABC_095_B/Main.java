package ABC_095_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int m[] = new int[N];
		
		int m_min = 1000;
		
		for(int i = 0; i < N; i++) {
			m[i] = sc.nextInt();
			X -= m[i];
			
			if(m_min > m[i]) {
				m_min = m[i];
			}
		}
		
		System.out.println(N + X / m_min);
	}
}
