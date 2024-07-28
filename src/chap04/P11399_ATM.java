package chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11399_ATM {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		int A[] = new int[N]; // 배열 
		int S[] = new int[N]; // 합 배열 
		
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			int insert_point = i; // 삽입 포인트
			int insert_value = A[i]; // 삽입 값
			
			for(int j = i-1; j >= 0; j--) {
				if(A[j] < A[i]) { // insert 포인트가 j 보다 크다면 바로 중단
					insert_point = j+1; // j 바로 앞에 삽입 포인트 할당
					break;
				}
				if( j == 0) { // 제일 작은 수라면 삽입 포인트 0
					insert_point = 0;
				}
			}
			for(int j = i; j > insert_point; j--) { // 삽입포인트보다 값이 크다면 뒤로 한칸씩 
				A[j] = A[j-1];
			}
			A[insert_point] = insert_value;
		}
		
		int SUM = 0;
		int Total = 0;
		for(int i = 0; i < N; i++) {
			S[i] = SUM + A[i];
			SUM += A[i];
			Total += SUM;
		}
		System.out.println(Total);
	}
}
