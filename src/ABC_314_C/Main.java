package ABC_314_C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String S = sc.next();
		int C[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		
		String answer = S;
		
		for(int i = 1; i <= M; i++) {
			List<Integer> positionList = new ArrayList<Integer>();
			for(int j = 0; j < N; j++) {
				if(C[j] == i) {
					positionList.add(j);
				}
			}
			
			String str = "";
			for(Integer j : positionList) {
				str = str + S.substring(j, j + 1);
			}
//			System.out.println("str=" + str);
//			System.out.println("answer=" + answer);
			
			String shift = str.substring(str.length() - 1, str.length()) + str.substring(0, str.length() - 1);
//			System.out.println("shift=" + shift);
			
			int k = 0;
			for(Integer j : positionList) {
//				System.out.println("j=" + j);
				if(j == 0) {
					answer = shift.substring(j, j + 1) + answer.substring(1);
//					System.out.println("answer=" + answer);
					k++;
				}else {
					answer = answer.substring(0, j) + shift.substring(k, k + 1) + answer.substring(j + 1);
//					System.out.println("answer=" + answer);
					k++;
				}
				

			}
		}
		System.out.println(answer);
	}
	

}



