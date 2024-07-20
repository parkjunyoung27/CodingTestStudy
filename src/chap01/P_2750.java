package chap01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P_2750 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);

		// 첫번째 줄의 수의 개수 
		//System.out.println("몇개를 사용하시겠습니까? ");
		int Num = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		// 두번째 줄부터 N개의 줄에 숫자가 주어진다. 
		// 1,000,000보다 작거나 같은 정수, 수는 중복되지 않는다.
		for(int i = 0; i < Num; i++) {
			//System.out.println("숫자를 입력하세요 : ");
			int addNum = sc.nextInt();
			arr.add(addNum);
		}
		
		//System.out.println(arr);
		Collections.sort(arr);
		//System.out.println(arr);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
