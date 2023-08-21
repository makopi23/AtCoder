package ABC_315_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		System.out.println(S.replace("a", "").replace("i", "").replace("u", "").replace("e", "").replace("o", ""));
		

	}
}