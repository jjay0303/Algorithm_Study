package algorithm.stackQue;

import java.util.Scanner;
import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s = sc.nextLine();
		
		System.out.println(solution(s));

	}
	
	public static String solution(String s) {
		
		Stack<Character> stack = new Stack<Character>();		// 스택 생성
		
		for(int i=0; i<s.length(); i++) {						
			char ch = s.charAt(i);								// 문자열을 한 문자 씩 비교하여 
			
			if(!stack.isEmpty() && ch == stack.peek()) {		// 스택 맨 위에 있는 문자열과 해당 문자열이 같으면
				stack.pop();									// 스택에서 제거
			}else {
				stack.add(ch);									// 같지 않으면 스택에 삽입
			}
		}
		
		return stack.isEmpty()? "제거성공":"제거실패";				// 스택에 문자열이 남아있지 않으면 제거 성공!
	}

}
