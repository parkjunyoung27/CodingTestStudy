package chap03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11003_최솟값찾기 {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력을 버퍼에 넣고 한 번에 출력하기 위해 BurredWriter 사용 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 숫자의 개수 
		int L = Integer.parseInt(st.nextToken()); // 슬라이딩 윈도우의 크기
		st = new StringTokenizer(br.readLine());  // 숫자 배열
		Deque<Node> mydeque = new LinkedList<Node>();
		for (int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken());
			// 새로운 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임
			while(!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.removeFirst();
			}
			mydeque.addLast(new Node(now, i));
			// 범위에서 벗어난 값은 덱에서 제거 
			if (mydeque.getFirst().index <= i - L) {
				mydeque.removeFirst();
			}
			bw.write(mydeque.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
	}
	
	static class Node{
		public int value;
		public int index;
		
		Node(int Value, int index){
			this.value = Value;
			this.index = index;
		}
	}

}
