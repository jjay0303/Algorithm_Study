package algorithm.recusion;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = sc.nextInt();
		
		System.out.println("재귀함수 O : " + num + "! = " + factorial(num));
		System.out.println("재귀함수 X : " +num + "! = " + factorialNorecusion(num));
	}
	
	// 재귀함수 O
	public static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n-1);
		}else {
			return 1;
		}
	}
	
	// 재귀함수 X
	public static int factorialNorecusion(int num) {
		if(num > 0) {
			int result = 1;
			for(int i = num; i>0; i--) {
				result *= i;
			}
			return result;
		}else {
			return 1;
		}
	}

}
