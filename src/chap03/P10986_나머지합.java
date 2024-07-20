package chap03;

import java.io.IOException;
import java.util.Scanner;

public class P10986_나머지합 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받기(수열의 개수)
		int N = sc.nextInt(); 
		// 입력받기(나누어 떨어지는 수)
		int M = sc.nextInt();
		
		// 합 배열
		long[] S = new long[N];
		// 나머지 인덱스 배열
		long[] C = new long[M];
		
		// 카운트
		long answer = 0;
		
		// 합배열 저장
		S[0] = sc.nextInt();
		for (int i = 1; i < N; i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		
		// 합배열의 모든 값에 % 연산 수행하기
		for (int i = 0; i < N; i++) {
			int reminder = (int) (S[i] % M);
			// 0 ~ i 까지의 구간 합 자체가 0일 떄 정답에 더하기
			if (reminder == 0) answer++;
			// 나머지가 같은 인덱스의 개수 카운팅하기
			C[reminder]++;
		}
		
		for (int i = 0; i < M; i++) {
			if (C[i] > 1) {
				// 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
				answer = answer + (C[i] * (C[i]-1) / 2);
			}
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
