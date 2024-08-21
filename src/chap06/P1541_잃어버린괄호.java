package chap06;

import java.util.Scanner;

public class P1541_잃어버린괄호 {
	
	static int answer = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String example = sc.nextLine();
		String[] str = example.split("-");
		
		for(int i = 0; i < str.length; i++) {
			
			int temp = mySum(str[i]);
			
			if( i == 0) {
				answer += temp; // 첫 숫자는 +이기 때문에
			}else {
				answer -= temp;
			}
			
		}
		System.out.println(answer);
	}
	
	static int mySum(String a) {
		int sum = 0;
		String temp[] = a.split("[+]"); // +를 문자 그대로 인식하게 하기위해 괄호안에 넣음 \\+로 해도 됨
		for(int i = 0; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		return sum;
	}
}
