package chap08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p1707_이분그래프 {
	
	static ArrayList<Integer>[] A;
	static int[] check;
	static boolean visited[];
	static boolean IsEven;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 2
		for(int t = 0; t < N; t++) { 
			String[] s = br.readLine().split(" "); // [3,2], [1,3], [2,3]
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			A = new ArrayList[V+1];
			visited = new boolean[V+1];
			check = new int[V + 1];
			IsEven = true;
			for(int i = 1; i <= V; i++) {
				A[i] = new ArrayList<Integer>();
			}
			
			// 인접 리스트로 그래프 저장하기
			for(int i = 0; i < E; i++) {
				s = br.readLine().split(" ");
				int Start = Integer.parseInt(s[0]);
				int End = Integer.parseInt(s[1]);
				A[Start].add(End);
				A[End].add(Start);
			}
			
			// 주어진 그래프가 1개로 연결돼 있다는 보장이 없으므로 모든 노드에서 수행하기
			for(int i = 1; i <= V; i++) {
				if(IsEven)
					DFS(i);
				else
					break;
			}
			
			if(IsEven)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	
	public static void DFS(int node) { // DFS 구현하기
		visited[node] = true;
		for (int i : A[node]) {
			if(!visited[i]) {
				// 인접한 노드는 같은 집합이 아니므로 이전 노드와 다른 집합으로 처리하기
				check[i] = (check[node] + 1) % 2;
				DFS(i);
			}
			// 이미 방문한 노드가 현재 내 노드와 같은 집합이면 이분 그래프가 아님
			else if(check[node] == check[i]) {
				IsEven = false;
			}
		}
		
	}

}













