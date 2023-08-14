package ABC_081_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int all = 0;
		
		for(int i = 0; i <= N; i++) {
			//System.out.println("i=" + i);
			String str = Integer.toString(i);
			//System.out.println("str=" + str);
			String[] strArray = str.split("");
			int sum = 0;
			for(String s : strArray) {
				sum += Integer.parseInt(s);
			}
			//System.out.println("sum=" + sum);
			
			if(sum >= A && sum <= B) {
				all += i;
			}
			
		}
		
		System.out.println(all);
	}
}
