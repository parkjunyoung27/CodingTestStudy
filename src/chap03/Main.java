package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// 재료의 갯수 N
		int N = Integer.parseInt(bf.readLine());
		// 맞춰야 하는 수 M
		int M = Integer.parseInt(bf.readLine());
		// 재료의 배열
		int[] A = new int[N];
		
		// 중요
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 재료 오름차순 정렬
		Arrays.sort(A);
		bf.close();
		
		int i = 0; // StartIndex
		int j = N - 1; // EndIndex
		int count = 0; // 갑옷의 갯수
		
		while(i < j) {
			if(A[i] + A[j] < M) { // 재료 합 < M 
				i++;
			} else if (A[i] + A[j] > M) {// 재료 합 > M
				j--;
			} else{	// 맞는 경우
				i++;
				j--;
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
