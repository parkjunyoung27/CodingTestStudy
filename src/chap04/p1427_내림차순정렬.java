package chap04;

import java.util.Scanner;

public class p1427_내림차순정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Number = sc.next();
		int[] A = new int[Number.length()];
		sc.close();
		
		
		for(int i = 0; i < Number.length(); i ++) {
			A[i] = Integer.parseInt(Number.substring(i, i+1));
		}
		
		for(int i = 0; i < A.length; i++) {
			int MAX = A[i];
			for(int j = i + 1; j < A.length; j++) {
				if(MAX < A[j]) { 
					int temp = A[i];
					MAX = A[j];
					A[i] = MAX;
					A[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
	}
}
