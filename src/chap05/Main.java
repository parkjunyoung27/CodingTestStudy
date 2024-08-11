package chap05;

import java.util.Scanner;

public class Main {
	
	static int N;
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		N = sc.nextInt();

		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}
	
	public static void DFS(int number, int jarisu) {
		if(N == jarisu) {
			if(IsPrime(number)) {
				System.out.println(number);
			}
			return;
		}
		
		for (int i = 1; i < 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			
			if(IsPrime(number * 10 + i)) {
				DFS(number * 10 + i, jarisu+1);
			}
		}
		
	}
	
	public static boolean IsPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if(number % i == 0) {
				return false; // 소수가 아니면
			}
		}
		return true; // 소수이면
	}
	
}
