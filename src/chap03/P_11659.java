package chap03;

import java.util.Scanner;

public class P_11659 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int suNo = sc.nextInt();
		int quizNo = sc.nextInt();
		
		int[] A = new int[suNo+1]; 
		int[] S = new int[suNo+1];
		A[0] = 0;
		S[0] = 0;
		
		for(int i = 1; i < suNo+1; i++) {
			A[i] = sc.nextInt();
			S[i] = S[i-1] + A[i];
		}
		
		for(int i = 0; i < S.length; i++) {
			System.out.print(S[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(quizNo+"번의 합을 출력합니다.");
		System.out.println("시작구간과 마지막 구간을 적어주세요.");
		for(int i = 0; i < quizNo; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(S[end] - S[start-1]);
		}
	}
}
