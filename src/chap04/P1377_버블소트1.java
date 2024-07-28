package chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1377_버블소트1 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		// 데이터 개수
		int N = Integer.parseInt(reader.readLine());
		// 데이터 배열, 단 클래스를 데이터로 담는 배열
		mData[] A = new mData[N];
		for (int i = 0; i < N; i++) {
			A[i] = new mData(Integer.parseInt(reader.readLine()), i);
		}
			
		// A 배열 정렬 O(nlogn) 시간 복잡도	
		Arrays.sort(A); // mData 클래스의 compareTo 메서드를 오버라이드하여 값 기준으로 정렬합니다.
		
		int Max = 0;
		for (int i = 0; i < N; i++) {
			if (Max < A[i].index - i) // 정렬 전 index - 정렬 후 index 계산의 최댓값 저장하기 
				Max = A[i].index - i;
		}
		System.out.println(Max + 1);
	}
}
	
class mData implements Comparable<mData>{
	int value;
	int index;
		
	// 별도 클래스 선언 
	public mData(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}
		
	@Override // Comparable 상속하려면 compareTo 선언을 해야됨  
	public int compareTo(mData o) { // value 기준 오름차순 정렬하기 
		return this.value - o.value;
	}
}
