package chap06;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1715_카드정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 카드 묶음의 수 저장
		// 우선순위가 낮은 숫자가 먼저 나옴 
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		// 우선순위가 높은 숫자가 먼저 나옴
		// PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder()); 
		
		for(int i = 0; i < N; i++) {
			int data = sc.nextInt();
			pq.add(data);
		}
		
		int data1 = 0;
		int data2 = 0;
		int sum = 0;
		
		while (pq.size() != 1) {
			data1 = pq.remove();
			data2 = pq.remove();
			sum += data1 + data2;
			pq.add(data1 + data2);
		}
		
		System.out.println(sum);
	}
}
