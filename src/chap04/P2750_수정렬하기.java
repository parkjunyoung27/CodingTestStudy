package chap04;

import java.util.Scanner;

public class P2750_수정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 줄의 개수
		int N = sc.nextInt();
		
		int[] A = new int[N]; 
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(A[i] > A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		
		for (int i =0; i < N; i++) {
			System.out.println(A[i]);
		}
	}
}
