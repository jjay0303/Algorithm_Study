package algorithm.recusion;

import java.util.Scanner;

public class Euclidean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력");
		int num1 = sc.nextInt();
		System.out.println("정수2 입력");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "와 " + num2 + "의 최대공약수는 " + gcd(num1, num2));
	}
	
	// 재귀함수 O
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	
	// 재귀함수 X
	public static int gcdNorecusion(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			int tmp = 0;
			if(a<b) {			// a에 큰 값 위치
				tmp = a;
				a = b;
				b = tmp;
			}
			while(b != 0) {
				tmp = a%b;
				a = b;
				b = tmp;
			}
			return a;			// b가 0일 때 a의 값이 gcd
		}
	}

}
