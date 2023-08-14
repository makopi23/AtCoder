package ABC_088_B;

import java.util.ArrayList;
import java.util.Collections;
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
		
		int Alice = 0;
		int Bob = 0;
		
		Collections.sort(list, Collections.reverseOrder());
		
		int size = list.size();
		
		for(int i = 0; i < size; i++) {
			if(i % 2 == 0) {
				Alice += list.get(i);
			}else {
				Bob += list.get(i);
			}
		}
		
		if(Alice > Bob) {
			System.out.println(Alice - Bob);
		}else {
			System.out.println(Bob - Alice);
		}
	}
}
