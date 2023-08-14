package ABC_085_B;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List dList = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			dList.add(sc.nextInt());
		}
		
		List dList2 = new ArrayList<Integer>(new LinkedHashSet<>(dList));
		
		//Collections.sort(dList2);
		
		System.out.println(dList2.size());
	}
}
