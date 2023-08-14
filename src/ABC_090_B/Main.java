package ABC_090_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int count = 0;
		
		for(int i = A; i <= B; i++) {
			String str = Integer.toString(i);
			StringBuilder sb = new StringBuilder();
			sb.append(str);
			sb.reverse();
			String reverse = sb.toString();
			
			//System.out.println("i=" + i + ", str=" + str + ", reverse=" + reverse);
			
			if(str.equals(reverse)) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
