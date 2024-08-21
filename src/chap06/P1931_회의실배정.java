package chap06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1931_회의실배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][2];
		for (int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		
		Arrays.sort(A, getComparator());
		
		int count = 0;
		int end = -1;
		
		for(int i = 0; i < N; i++) {
			if(A[i][0] >= end) { // 겹치지 않는 다음 회의가 나온 경우
				end = A[i][1]; // 종료 시간 업데이트하기 
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static Comparator<int[]> getComparator() {
	    return new Comparator<int[]>() {
	        @Override
	        public int compare(int[] S, int[] E) {
	            if (S[1] == E[1]) { // 종료 시간이 같을 때
	                return S[0] - E[0]; // 시작시간 앞
	            }
	            return S[1] - E[1]; // 종료시간 기준
	        }
	    };
	}
}
