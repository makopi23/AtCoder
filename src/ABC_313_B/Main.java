package ABC_313_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		List<Integer> personList = new ArrayList<Integer>();
		for(int i = 1; i <= N; i++) {
			personList.add(i);
		}
		//System.out.println("personList.size() = " + personList.size());
	
		List<Strength> strengthList = new ArrayList<Strength>();
		
		int start_a = 0;
		
		for(int i = 0; i < M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			Strength strength = new Strength(A, B);
			strengthList.add(strength);
			
			if(i == 0) {
				start_a = A;
			}
		}
		
		//System.out.println(strengthList.size());
		
		for(int i = 0; i < strengthList.size(); i++) {
			//int a = strengthList.get(i).A;
			int b = strengthList.get(i).B;
			//System.out.println(b);
			for(int j = 0; j < personList.size(); j++) {
				Integer person = personList.get(j);
				if(person.intValue() == b) {
					personList.remove(j);
					//break;
				}
			}
			delete(b, strengthList, personList, start_a);
		}
		
		int count=0; 
		int saikyo = 0;
		for(int i = 0; i < strengthList.size(); i++) {
			Strength strength = strengthList.get(i);
			if(strength.A != 0) {
				saikyo = strength.A;
				count++;
			}
			if(count > 1) {
				System.out.println("-1");
				return;
			}

		}
		
//		if(personList.size() > 1) {
//			System.out.println("-1");
//			//System.out.println("personList.size() = " + personList.size());
//			return;
//		}
		
		int count2 = 0;
		for(int i = 0; i < personList.size(); i++) {
			Integer parson = personList.get(i);
			if(parson.intValue() != 0) {
				count2++;
				if(count2 > 1) {
					System.out.println("-1");
					return;
				}
			}
		}
		
		System.out.println(saikyo);
		
	}
	
	public static void delete(int b, List<Strength> strengthList, List<Integer> personList, int start_a){
		//int size = strengthList.size();
		for(int i = 0; i < strengthList.size(); i++) {
			Strength strength = strengthList.get(i);
			
			
			if(b == strength.A) {
				//int B = strength.B;
				strengthList.set(i, new Strength(0, 0));
				//strengthList.remove(i);
				//i--;
				//i = 0;
				
				for(int j = 0; j < personList.size(); j++) {
					Integer person = personList.get(j);
					if(person.intValue() == strength.B) {
						personList.set(j, 0);
//						personList.remove(j);
//						//j--;
//						j = 0;
						//break;
					}
				}

				
				delete(strength.B, strengthList, personList, start_a);
			}
			
//			if(strengthList.get(i).B == start_a) {
//				strengthList.remove(i);
//				
//				for(int j = 0; j < personList.size(); j++) {
//					Integer person = personList.get(j);
//					if(person.intValue() == start_a) {
//						personList.remove(j);
//						j--;
//						//break;
//					}
//				}
//			}
		}
	}
}

class Strength{
	int A;
	int B;
	
	public Strength(int a, int b) {
		A = a;
		B = b;
	}
}
