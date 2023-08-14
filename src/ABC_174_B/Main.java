package ABC_174_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		int D = sc.nextInt();
		
		long x[] = new long[N];
		long y[] = new long[N];
		
		int count = 0;
		
		
		
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			
			double distance = (double)Math.sqrt(x[i] * x[i]  + y[i] * y[i]);
			
			//System.out.println(distance);
			
			if(distance <= (double)D) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
