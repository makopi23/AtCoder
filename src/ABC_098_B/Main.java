package ABC_098_B;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		
		int max = 0;
		
		for(int i = 1; i < N; i++) {
			String str1 = S.substring(0, i);
			String str2 = S.substring(i);
//			System.out.println("str1=" + str1 + ", str2=" + str2);
			
			int count = 0;
			

			HashSet<String> hash = new HashSet<String>();
			
			for(int j = 0; j < str1.length(); j++) {
				String term = str1.substring(j, j + 1);
				hash.add(term);
			}
			
			String str1_hashsort = hash.toString();
			str1_hashsort = str1_hashsort.substring(1, str1_hashsort.length() - 1);
			str1_hashsort = str1_hashsort.replace(",", "").replace(" ", "");
//			System.out.println(str1_hashsort);
			
			for(int j = 0; j < str1_hashsort.length(); j++) {
				if(str2.contains(str1_hashsort.substring(j, j + 1))) {
					count++;
					if(count > max) {
						max = count;
					}
				}
			}
				
		}
		System.out.println(max);
		
	}
}
