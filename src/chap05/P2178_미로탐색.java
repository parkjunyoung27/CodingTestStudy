package chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178_미로탐색 {

	// 상하좌우를 탐색하기 위한 배열 선언하기
	static int[] dx = { 0, 1, 0, -1};
	static int[] dy = { 1, 0, -1, 0};
	static boolean[][] visited;
	static int[][] A;
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j+1)); // 행렬 값 넣기
			}
		}
		BFS(0, 0);
//		System.out.println(A[N-1][M-1]);
		for(int i = 0; i < A.length; i ++) {
			for(int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i, j}); // offer 함수는 add와 같지만 queue가 꽉 찰경우 false를 리턴함
		visited[i][j] = true;
		
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			for(int k = 0; k < 4; k++) { // k 는 상하좌우 
				int x = now[0] + dx[k]; // 현재 x 위치
				int y = now[1] + dy[k]; // 현재 y 위치
				// 좌표 유효성 검사하기 ** 중요 **
				if( x>= 0 && y >= 0 && x < N && y < M) { 
					// 갈 수 있는 칸 && 방문 검사하기
					if(A[x][y] != 0 && !visited[x][y]) {
						visited[x][y] = true;
						// 깊이 업데이트하기
						A[x][y] = A[now[0]][now[1]] + 1;
						queue.add(new int[] {x,y});
					}
				}
			}
		}
	}
	
}






























