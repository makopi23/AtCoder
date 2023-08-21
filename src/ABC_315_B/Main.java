package ABC_315_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int D[] = new int[M];
		
		int days = 0;
		
		
		
		for(int i = 0; i < M; i++) {
			D[i] = sc.nextInt();
			days += D[i];
		}
		
		int middle = (days + 1) / 2;
		
		//System.out.println("middle=" + middle);
		
		int sum = 0;
		
		for(int i = 0; i < M; i++) {
			if(middle > sum + D[i]) {
				sum += D[i];
			}else {
				System.out.println((i + 1) + " " + (middle - sum));
				return;
			}
			
		}

	}
}