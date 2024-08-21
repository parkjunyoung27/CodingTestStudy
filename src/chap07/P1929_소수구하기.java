package chap07;

import java.util.Scanner;

public class P1929_소수구하기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); // 시작 수 
		int N = sc.nextInt(); // 종료 수
		int[] A = new int[N + 1];
		
		for(int i = 2; i <= N; i++) {
			A[i] = i;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("");
		
		for(int i = 2; i <= Math.sqrt(N); i++) { // 제곱근까지만 수행하기
			if(A[i] == 0) { // M 이전 넘어감
				continue;
			}
			
			for(int j = i + i; j <= N; j = j + i) { // 배수 지우기
				A[j] = 0; // 이 수가 소수가 아니라는 것 표시하기 2, 3의 배수인 값들 모두 지우기 4 미만  
			}
		}
		
		for(int i = M; i < N; i++) {
			if(A[i] != 0) {
				System.out.println(A[i]);
			}
		}
		
	}
}
