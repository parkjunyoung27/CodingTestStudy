package chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724_연결요소의개수 {
	static ArrayList<Integer>[] A; // 인접리스트
	static boolean visited[]; // 방문 기록 저장
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 노드 갯수
		int m = Integer.parseInt(st.nextToken()); // 엣지 갯수
		A = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for (int i = 1; i < n+1; i++) {
			// 배열 안에 배열
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s); // 양방향 에지이므로 양쪽에 에지를 더하기

		}
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("A["+i+"] : " + A[i]);
		}
		
		
		int count = 0;
		for (int i = 1; i < n+1; i++) {
			if(!visited[i]) {
				count++; // 연결요소개수 카운트
				DFS(i);
			}
		}
		System.out.println(count);
	}
	
	static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		for(int i : A[v]) {
			// 연결 노드 중 방문하지 않았던 노드만 탐색하기
			System.out.println( "visited[" + i + "] :" + visited[i] + "값 출력");
			if(visited[i] == false) { // false 면 탐색
				DFS(i);
			}
		}
	}
	
}



















