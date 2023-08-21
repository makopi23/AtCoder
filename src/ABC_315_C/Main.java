package ABC_315_C;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int N_MAX = 300003;
		
		int N = sc.nextInt();
		int F[] = new int[N];
		int S[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			F[i] = sc.nextInt();
			S[i]= sc.nextInt();
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			if(map.get(F[i]) == null) {
				map.put(F[i], S[i]);
//				System.out.println(F[i] + ":" + S[i]);
			}else if(map.get(F[i]) > S[i]) {
				map.put(i + N_MAX, S[i] / 2);
//				System.out.println(F[i] + ":" + S[i] / 2);
			}else if(map.get(F[i]) <= S[i]) {
				int value = map.get(F[i]) / 2;
				map.put(i + N_MAX, value);
				
//				System.out.println(F[i] + ":" + value);
				map.put(F[i], S[i]);
//				System.out.println(i + N_MAX + ":" + S[i]);
			}
		}
		
		int Point[] = new int[N + N_MAX];
		
		for(int i = 0; i < N + N_MAX; i++) {
			if(map.get(i) == null) {
				Point[i] = 0;
			}else {
				Point[i] = map.get(i);
			}
		}
		
		Arrays.sort(Point);
		
//		for(int i = 0; i < Point.length; i++) {
//			if(Point[i] != 0) {
//				System.out.println("i=" + i + ", Point = " + Point[i]);
//			}
//		}
		
		System.out.println(Point[Point.length - 1] + Point[Point.length - 2]);
		

	}
}