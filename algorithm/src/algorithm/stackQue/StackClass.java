package algorithm.stackQue;

import java.util.Stack;

// stack 클래스 사용
public class StackClass {

	public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<>();
		
		stk.push(1);
		stk.push(3);
		stk.push(5);
		stk.push(7);			// stack 값 추가 
		
		System.out.println(stk);
		
		stk.pop();
		stk.pop();				// stack 값 삭제
		
		System.out.println(stk);
		
		System.out.println("stack이 비어잇는지? : " + stk.empty());		
		System.out.println("stack의 꼭데기 값 : " + stk.peek());			
		System.out.println("stack에 1이 있는지 확인 : " + stk.contains(1));	

		
	}

}
