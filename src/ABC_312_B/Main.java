package ABC_312_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String[][] cell = new String[N][M];	
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			for(int j = 0; j < M; j++) {
				cell[i][j] = str.substring(j, j + 1);
			}
		}
		
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < M; j++) {
//				System.out.print(cell[i][j]);
//			}
//			System.out.println();
//		}
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < N - 8; i++) {
			for(int j = 0; j < M - 8; j++) {
				if(isTaKCode(i, j, cell)) {
					list.add((i + 1) + " " + (j + 1));
					
				}
			}
		}
		
		for(String str : list) {
			System.out.println(str);
		}
	}
	
	private static boolean isTaKCode(int i, int j, String[][] cell) {
		// 左上が黒
		for(int m = i; m < i + 3; m++) {
			for(int n = j; n < j + 3; n++) {
				if(!cell[m][n].equals("#")) {
					return false;
				}
			}
		}
		
		// 右下が黒
		for(int m = i + 6; m < i + 9; m++) {
			for(int n = j + 6; n < j + 9; n++) {
				if(!cell[m][n].equals("#")) {
					return false;
				}
			}
		}
		
		
		// 左上の8方向が白
		if(!cell[i + 3][j].equals("."))  return false;
		if(!cell[i + 3][j + 1].equals("."))  return false;
		if(!cell[i + 3][j + 2].equals("."))  return false;
		if(!cell[i][j + 3].equals("."))  return false;
		if(!cell[i + 1][j + 3].equals("."))  return false;
		if(!cell[i + 2][j + 3].equals("."))  return false;
		if(!cell[i + 3][j + 3].equals("."))  return false;
		
		// 右下の8方向が白
		if(!cell[i + 5][j + 5].equals("."))  return false;
		if(!cell[i + 5][j + 6].equals("."))  return false;
		if(!cell[i + 5][j + 7].equals("."))  return false;
		if(!cell[i + 5][j + 8].equals("."))  return false;
		if(!cell[i + 6][j + 5].equals("."))  return false;
		if(!cell[i + 7][j + 5].equals("."))  return false;
		if(!cell[i + 8][j + 5].equals("."))  return false;

		return true;
	}
}
