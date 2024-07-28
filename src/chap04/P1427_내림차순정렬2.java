package chap04;

import java.util.Scanner;

public class P1427_내림차순정렬2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Number = sc.next();
		int[] A = new int[Number.length()];
		sc.close();
		
		
		for(int i = 0; i < Number.length(); i ++) {
			A[i] = Integer.parseInt(Number.substring(i, i+1));
		}
		
		for(int i = 0; i < A.length; i++) {
			int Max = i; // 인덱스 활용
			for(int j = i + 1; j < A.length; j++) {
				if(A[Max] < A[j]) { 
					Max = j;
				}
				// 더 효율적 
				if(A[i] < A[Max]) {
					int temp = A[i];
					A[i] = A[Max];
					A[Max] = temp;
				}
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
	}
}
