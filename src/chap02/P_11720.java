package chap02;

import java.util.Scanner;

public class P_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("갯수를 입력하세요 : ");

		int N = sc.nextInt();
		
		// 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
		System.out.println("숫자를 입력하세요 : ");
		String sNum = sc.next();
		sc.close();
		
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += cNum[i] - '0'; //cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
		}
		
		System.out.println(sum);
		
	}
}
