package ABC_314_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		
//		int C[] = new int[N];
//		
//		List<Integer> A_List = new ArrayList<Integer>();
		
		List<Roulette> rouletteList = new ArrayList<Roulette>();
		
		for(int i = 0; i < N; i++) {
			Roulette roulette = new Roulette();
			roulette.C = sc.nextInt();
			for(int j = 0; j < roulette.C; j++) {
				roulette.A_List.add(sc.nextInt());
			}
			rouletteList.add(roulette);
		}
		
		int X = sc.nextInt();
		
		List<Integer> personList = new ArrayList<Integer>();
		
		int min_count = 38;
		
		for(int i = 0; i < N; i++) {
			List<Integer> a_list = rouletteList.get(i).A_List;
			for(Integer B : a_list) {
				if(B.intValue() == X) {
					personList.add(i);
					//System.out.println("i=" + i + 1);
					
					if(min_count > a_list.size()) {
						min_count = a_list.size();
					}
					break;
				}
			}
		}
		//System.out.println("min_count=" + min_count);
		
		String output = "";
		int count = 0;
		
		for(Integer i : personList) {
			if(rouletteList.get(i).A_List.size() == min_count) {
				count++;
//				System.out.print(i + 1);
//				System.out.print(" ");
				output = output + (i + 1) + " ";
			}
		}
		
		if(personList.size() == 0) {
			System.out.println("0");
		}else {
			System.out.println(count);
			System.out.println(output);
		}
	}
	

}

class Roulette{
	int C;
	List<Integer> A_List = new ArrayList<Integer>();
}

