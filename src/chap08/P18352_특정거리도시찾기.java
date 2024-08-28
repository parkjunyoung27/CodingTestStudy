package chap08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P18352_특정거리도시찾기 {
	
	static int  visited[]; // 방문 거리 저장 배열
	static ArrayList<Integer>[] A; // 인접 리스트
	static int N, M, K, X; // 노드, 에지, 거리, 시작 점
	static ArrayList<Integer> answer; // 정답 리스트
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 노드의 수
		M = sc.nextInt(); // 에지의 수 
		K = sc.nextInt(); // 목표 거리
		X = sc.nextInt(); // 시작점
		A = new ArrayList[N+1]; 
		answer = new ArrayList<>();

		for(int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) { // 에지의 개수 만큼
			int S = sc.nextInt();
			int E = sc.nextInt();
			A[S].add(E);
		}
		
		visited = new int[N + 1]; // 방문 배열 초기화하기
		for(int i = 0; i <= N; i++) {
			visited[i] = -1;
		}
		
		BFS(X); // 시작 점
		
		for(int i = 0; i <= N; i++) {
			if(visited[i] == K) {
				answer.add(i);
			}
		}
		
		if(answer.isEmpty()) {
			System.out.println("-1");
		}else {
			Collections.sort(answer);
			for(int temp: answer) {
				System.out.println(temp);
			}
		}
	}
	
	// BFS 구현하기 
	private static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visited[Node]++; // -1 부터 시작
		while (!queue.isEmpty()) {
			int now_Node = queue.poll();
			for(int i : A[now_Node]) { // A[i] = new ArrayList<Integer>();
				if(visited[i] == -1) {
					visited[i] = visited[now_Node] + 1; // 이전 값 + 1
					queue.add(i);
				}
			}
		}
	}

}















