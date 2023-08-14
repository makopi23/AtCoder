package ABC_083_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		
		int count = 0;
		
		while(true) {
			for(int i = 0; i < N; i++) {
				if(list.get(i) % 2 == 0) {
					list.set(i, list.get(i) / 2);
				}else {
					System.out.println(count);
					return;
				}
			}
			count++;
		}
	}
}
