package chap03;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 수열 개수
		int[] A = new int[N]; // 수열 배열 
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer bf = new StringBuffer();
		int num = 1; // 오름차순 수
		boolean result = true;
		
		for (int i = 0; i < A.length; i++) {
			int su = A[i]; // 현재 수열의 수, 중요
			if (su >= num) { // 현재 수열 값 >= 요름차순 자연수 : 값이 같아질 때까지 push()
				while(su >= num) { //값이 같아질 때 
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}
			else { // 현재 수열 값 < 오름차순 자연수 : pop()을 수행해 수열 원소를 꺼냄 
				int n = stack.pop();
				// 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음 
				if ( n > su) {
					System.out.println("NO");
					result = false;
					break;
				} else { // 값이 같은걸 뺴고, 그 이후 값이 같기 전까지 수열과 자연수가 같기전에 타는 곳
					bf.append("ㅎㅇ-\n");
				}
				
			}
		}
		if (result) System.out.println(bf.toString());
	}
}
