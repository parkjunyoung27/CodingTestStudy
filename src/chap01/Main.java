package chap01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 첫번째 줄의 수의 개수 
		int Num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < Num; i++) {
			int addNum = sc.nextInt();
			arr.add(addNum);
		}
		sc.close();
		
		Collections.sort(arr);
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
