package chap01;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		
		// TODO 배열에서 주어진 범위의 합을 구하는 프로그램을 구하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.println("testcase : "); 
		
		int testcase = sc.nextInt();
		int answer = 0;
		int A[] = new int[100001];
		int S[] = new int[100001];
		
		// 범위 잘못 지정
		for ( int i = 1; i < 10000; i++) {
			A[i] = (int) (Math.random() * Integer.MAX_VALUE);
			S[i] = S[i-1] + A[i];
		}
		
		for(int t = 1; t < testcase; t++) {
			System.out.println("query : "); 
			int query = sc.nextInt();
			for (int i = 0; i< query; i++) {
				System.out.println("start : "); 
				int start = sc.nextInt();
				System.out.println("end : "); 
				int end = sc.nextInt();
				answer += S[end] - S[start-1]; // 변수 초기화 필요
				System.out.println(testcase + " " + answer); // testcase 변수 사용
			}
		}
		
		sc.close();
	}
}
