package chap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1167_트리의지름 {
	static boolean visited[];
	static int[] distance;
	static ArrayList<Edge>[] A;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 노드 갯수
		A = new ArrayList[N+1];
		
		for(int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Edge>();
		}
		
		for (int i = 0; i < N; i++) { // A 인접 리스트에 그래프 데이터 저장하기
			int S = sc.nextInt();
			while(true) {
				int E = sc.nextInt();
				if(E == -1)
					break;
				int V = sc.nextInt();
				A[S].add(new Edge(E,V));
			}
		}
		
		distance = new int[N+1];
		visited = new boolean[N+1];
		BFS(1);
		int Max = 1;
		// distance 배열에서 가장 큰 값으로 다시 시작점 설정
		for(int i = 2; i <= N; i++) {
			if(distance[Max] < distance[i])
				Max = i;
		}
		
		distance = new int[N+1];
		visited = new boolean[N+1];
		BFS(Max);
		Arrays.sort(distance);
		System.out.println(distance[N]);
	}
	
	private static void BFS(int index) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(index);
		visited[index] = true;
		while(!queue.isEmpty()) {
			int now_node = queue.poll();
			for (Edge i : A[now_node]) {
				int e = i.e;
				int v = i.value;
				if (!visited[e]) {
					visited[e] = true;
					queue.add(e);
					distance[e] = distance[now_node] + v; 
				}
			}
		}
		
	}
}

class Edge2{
	int e;
	int value;
	public Edge2(int e, int value) {
		this.e = e;
		this.value = value;
	}
}
