package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {
	
	static int checkArr[]; // 비밀번호 체크 배열 // 유효값 배열 
	static int myArr[]; // 현재 상태 배열
	static int checkSecret; // 몇 개의 문자와 관련된 개수를 충족했는지 판단하는 변수
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		// 문자열 크기
		int S = Integer.parseInt(st.nextToken());
		// 부분 문자열 크기
		int P = Integer.parseInt(st.nextToken());
		
		int Result = 0;
		
		char A[] = new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		checkSecret = 0;
		
		// 문자열 데이터 입력
		A = bf.readLine().toCharArray();
		
		st = new StringTokenizer(bf.readLine()); // 비밀번호 체크 배열 
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) // 0개면 checkSecret ++ -> 4면 완성
				checkSecret++;
		}
		
		for (int i = 0; i < P; i++) { // 초기 P가 부분 문자열 처리 부분 
			Add(A[i]);
		}
		
		if (checkSecret == 4)
			Result++;
		// 슬라이딩 윈도우 처리 부분 
		for (int i = P; i < S; i++) {
			int j = i - P; // P의 시작 인덱스
			Add(A[i]);
			Remove(A[j]);
			if (checkSecret == 4)
				Result++;
		}
		System.out.println(Result);
		bf.close();
	}
	
	// 새로 들어온 문자를 처리하는 함수
	private static void Add(char c) {
		switch(c) {
		case 'A' :
			myArr[0]++;
			if(myArr[0] == checkArr[0])
				checkSecret++;
			break;
		case 'C' :
			myArr[1]++;
			if(myArr[1] == checkArr[1])
				checkSecret++;
			break;
		case 'G' :
			myArr[2]++;
			if(myArr[2] == checkArr[2]) // 현재 상태 배열과 체크 배열 같을 시 checkSecret++
				checkSecret++;
			break;
		case 'T' :
			myArr[3]++;
			if(myArr[3] == checkArr[3])
				checkSecret++;
			break;
		}
	}
	
	// 제거되는 문자를 처리하는 함수
	private static void Remove(char c) {
		switch(c) {
		case 'A' :
			if(myArr[0] == checkArr[0]) // 현재 상태 배열과 체크 배열 같을 시 checkSecret--
				checkSecret--;
			myArr[0]--;
			break;
		case 'C' :
			if(myArr[1] == checkArr[1])
				checkSecret--;
			myArr[1]--;
			break;
		case 'G' :
			if(myArr[2] == checkArr[2])
				checkSecret--;
			myArr[2]--;
			break;
		case 'T' :
			if(myArr[3] == checkArr[3])
				checkSecret--;
			myArr[3]--;
			break;
		}
	}
	
}


















