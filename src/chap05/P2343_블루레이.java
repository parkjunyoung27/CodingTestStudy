package chap05;

import java.util.Scanner;

public class P2343_블루레이 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 레슨 개수
		int M = sc.nextInt(); // 블루레이 개수
		int[] A = new int[N]; // 레슨 데이터 저장 배열
		
		int start = 0; // 이진 탐색 시작 인덱스
		int end = 0; // 이진 탐색 종료 인덱스
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt(); // A 배열 저장 
			if(start < A[i]) { 
				start = A[i]; // A 배열 중 최댓값 시작 인덱스
			}
			end = end + A[i]; // A 배열의 총합 
		}
		
		while(start <= end) { // start가 end보다 커질때까지 
			int middle = (start + end) / 2;
			int sum = 0;
			int count = 0;
			for (int i = 0; i < N; i++) { // middle 값으로 모든 레슨을 저장할 수 있는지 확인
				if(sum + A[i] > middle) { // middle 보다 값이 컸을때 
//					System.out.print("sum : " + sum);
//					System.out.print(" A[i] : " + A[i]);
//					System.out.print(" middle : " + middle);
					count++;
					sum = 0; // 블루레이 1개 채울 때
				}
				sum = sum + A[i]; // 다시 시작
			}
			if(sum != 0) { // 탐색 후 sum이 0이 아니면 블루레이가 1개 더 필요하므로 더함
				count++;
			}
			if(count > M) { //
				start = middle + 1;
			} else { // 중간 인덱스값으로 모든 레슨 저장 가능 
				end = middle - 1; // 더 적은 인덱스로 저장 가능한지 확인 
			}
		}
		System.out.println(start);
	}

}
