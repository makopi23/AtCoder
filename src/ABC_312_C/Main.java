package ABC_312_C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int A[] = new int[N];
		int B[] = new int[M];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			//System.out.println("A[" + i + "] = " + A[i]);
		}
		
		for(int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
			//System.out.println("B[" + i + "] = " + B[i]);
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int a_min = A[0];
		int b_max = B[B.length - 1];
		
//		int a_min = A[0];
//		for(int i = 0; i < N; i++) {
//			if(A[i] < a_min) {
//				a_min = A[i];
//			}
//		}
//		
//		int b_max = B[0];
//		for(int i = 0; i < M; i++) {
//			if(B[i] > b_max) {
//				b_max = B[i];
//			}
//		}
		
		if(b_max < a_min) {
			System.out.println(b_max + 1);
			return;
		}
		
		
		int seller = 0;
		int buyer = 0;
		
		//AList<Integer> AList = new ArrayList<Integer>(Arrays.asList(A));
		List BList = Arrays.asList(B);
		
		List<Integer> priceList = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			seller = i + 1;
			
			for(int j = 0; j < M; j++) {
				if(A[i] <= B[j]) {
					buyer++;
				}
			}
			
			
			
			System.out.println("A[" + i + "] = " + A[i] +", seller=" + seller + ", buyer=" + buyer);
			
			if(seller >= buyer) {
				priceList.add(A[i]);
			}
			
			seller = 0;
			buyer = 0;
		}
		
		Collections.sort(priceList);
		
		System.out.println(priceList.get(0));
		
		
	}
	
}
