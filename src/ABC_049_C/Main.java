package ABC_049_C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		//String T = "";
		
		while(true) {
			if(S.endsWith("eraser")) {
				S = S.substring(0, S.length() - 6);
			}else if(S.endsWith("erase")) {
				S = S.substring(0, S.length() - 5);
			}else if(S.endsWith("dreamer")) {
				S = S.substring(0, S.length() - 7);
			}else if(S.endsWith("dream")) {
				S = S.substring(0, S.length() - 5);
			}else {
				System.out.println("NO");
				return;
			}
			
			if(S.length() == 0) {
				System.out.println("YES");
				return;
			}else if(S.length() < 5) {
				System.out.println("NO");
				return;
			}
		}

	}
}