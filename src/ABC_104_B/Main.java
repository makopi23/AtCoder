package ABC_104_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		// 文字列Sの1文字目がAでなければWA
		if(!S.substring(0, 1).equals("A")){
			System.out.println("WA");
			return;
		}
		
//		// 文字列Sの2文字目がCであればWA
//		if(S.substring(1, 2).equals("C")){
//			System.out.println("WA");
//			return;
//		}
		
//		// 文字列Sの末尾がCであればWA
//		if(S.substring(S.length() - 1, S.length()).equals("C")){
//			System.out.println("WA");
//			return;
//		}
		
		// 文字列Sの先頭から3文字目と末尾から2文字目に大文字のCがちょうど1個含まれなければWA
		String tmpStr = S.substring(2, S.length()-1);
		//System.out.println("tmpStr=" + tmpStr);
		int count = 0;
		for(int i = 0; i < tmpStr.length(); i++) {
			if(tmpStr.substring(i, i + 1).equals("C")) {
				count++;
				if(count == 2) {
					System.out.println("WA");
					return;
				}
			}
		}
		if(count == 0) {
			System.out.println("WA");
			return;
		}
		
//		// 以上のA,Cを除くSのすべての文字が小文字でなければWA
//		for(int i = 0; i < S.length(); i++) {
//			String s  = S.substring(i, i + 1);
//			if(!s.equals("A") && !s.equals("C") && Character.isUpperCase(s.toCharArray()[0])) {
//				System.out.println("WA");
//				return;
//			}
//		}
		
		int count2 = 0; 
		for(int i = 0; i < S.length(); i++) {
			String s  = S.substring(i, i + 1);
			if(Character.isUpperCase(s.toCharArray()[0])) {
				count2++;
			}
		}
		if(count2 != 2) {
			System.out.println("WA");
			return;
		}
		
		System.out.println("AC");
	}
}
