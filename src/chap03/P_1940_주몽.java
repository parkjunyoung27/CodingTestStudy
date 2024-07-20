package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P_1940_주몽 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); // 재료의 개수
		int M = Integer.parseInt(bf.readLine()); // 갑옷이 되는 번호 
		
		int[] A = new int[N]; // 재료 배열 크기 지정
		
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		
		// 1. 재료 배열 저장하기
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2. 재료 배열 정렬하기 
		Arrays.sort(A);
		
		int count = 0;
		int i = 0;
		int j = N - 1;
		while (i < j) { // 투 포인터 이동 원칙 따라 포인터를 이동하며 처리
			if(A[i] + A[j] < M) { // 합이 M보다 적을 시 
				i++;
			} else if (A[i] + A[j] > M) {
				j--;
			} else {
				count++;
				i++;
				j--;
			}
		}
		
		System.out.println(count);
		bf.close();
	}
}
