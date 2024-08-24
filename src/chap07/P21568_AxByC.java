package chap07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P21568_AxByC {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 1, 2, 3 번째 수 
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		// 최대 공약수 계산
		long gcd = gcd(a,b);
		if(c % gcd != 0) { //최대공약수 의 배수가 아니라면 종료
			System.out.println(-1);
		} else {
			int mok = (int) (c / gcd);
			long[] ret = Excute(a, b); // 나머지가 0 이 될 때 까지 재귀함수
			System.out.println(ret[0] * mok + " " + ret[1] * mok);
		}
		
		bw.close();
		
	}
	
	private static long[] Excute(long a, long b) {
		long[] ret = new long[2];
		if( b == 0) {
			ret[0] = 1; ret[1] = 0; // x = 1, y = 0
			return ret;
		}
		long q = a / b;
		long[] v = Excute(b, a % b); // 재귀
		ret[0] = v[1];
		ret[1] = v[0] - v[1] * q;
		return ret;
	}
	
	
	private static long gcd(long a, long b) {
		while(b != 0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}
}
