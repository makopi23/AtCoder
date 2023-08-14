package ABC_081_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		String str = sc.next();
				
		int count = 0;
		
		if(str.substring(0, 1).equals("1")) count++;
		if(str.substring(1, 2).equals("1")) count++;
		if(str.substring(2, 3).equals("1")) count++;
		
		System.out.println(count);
	}
}
