package chap05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 배열의 크기
		int K = sc.nextInt(); // 구하고자 하는 인덱스 
		long start = 1, end = K;
		long ans = 0;
		
		// 이진 탐색 수행하기
		while(start <= end) {
			long middle = (start + end) / 2;
			long cnt = 0;
			// 중앙값보다 작은 수는 몇 개인지 계산
			for (int i = 1; i <= N; i++) {
				cnt += Math.min(middle / i, N); // 작은 수를 카운트하는 핵심 로직
			}
			if (cnt < K) {
				start = middle + 1;
			} else { // 현재 단계의 중앙값을 정답 변수에 저장 
				ans = middle;
				end = middle - 1; 
			}
		}
		System.out.println(ans);
	}

}
