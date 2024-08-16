package chap05;

import java.util.Scanner;

public class P1300_K번째수 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 배열의 크기
		int K = sc.nextInt(); // 구하고자 하는 인덱스 
		long start = 1, end = K; // 시작 인덱스, 종료 인덱스 
		long ans = 0; 
		
		// 이진 탐색 수행하기
		while(start <= end) { // {1,7}, {5,7}, {5,5}, {6,5} 끝
			long middle = (start + end) / 2; // {4}, {6}, {5}
			long cnt = 0; 
			// 중앙값보다 작은 수는 몇 개인지 계산
			for (int i = 1; i <= N; i++) { // {3}
				cnt += Math.min(middle / i, N); // 작은 수를 카운트하는 핵심 로직 {6}, {8}, {6}
			}
			if (cnt < K) { // {6<7}, {8<7}, {6<7}
				start = middle + 1; // {5}, {6}
			} else { // 현재 단계의 중앙값을 정답 변수에 저장 
				ans = middle; // {6}
				end = middle - 1; // {5}
			}
		}
		System.out.println(ans);
	}
}
