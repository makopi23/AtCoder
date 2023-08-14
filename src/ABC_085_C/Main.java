package ABC_085_C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();

		int max_10000 = Y / 10000;
		int max_5000 = Y / 5000;

		for(int i = 0; i <= max_10000; i++) {
			for(int j = 0; j <= max_5000; j++) {

				if(N - i - j < 0) continue;
				int yen = 10000 * i + 5000 * j + 1000 * (N - i - j);

				if(Y == yen) {
					System.out.println(i + " " + j + " " + (N - i - j));
					return;
				}
				else {
					continue;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}