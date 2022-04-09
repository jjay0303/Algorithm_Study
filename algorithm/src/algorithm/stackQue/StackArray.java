package algorithm.stackQue;

// 배열로 스택 구현
public class StackArray {

	public static void main(String[] args) {
		
		ArrayStack stk = new ArrayStack(5);
		
		stk.push(1);
		stk.push(73);
		stk.push(5);
		stk.push(101);
		stk.push(22);
		
		System.out.println("첫번째 출력");
		stk.printStack();
		
		stk.pop();
		stk.pop();
		stk.pop();
		
		System.out.println("\n두번째 출력");
		stk.printStack();
		
		stk.push(0);
	
		System.out.println("\n세번째 출력");
		stk.printStack();
		stk.peek();
		
	}

}

class ArrayStack {

	private int size;		// 스택 사이즈	
	private int top;		// 스택 인덱스
	private int[] stk;	
	
	public ArrayStack(int size) {
		this.size = size;
		stk = new int[size];
		top = -1;		
	}
	
	public void push(int num){
		stk[++top] = num;
	}
	
	public int pop() {
		System.out.println(stk[top] + "pop");
		return stk[top--];
	}
	
	public void peek() {
		System.out.println("peek : " + stk[top]);
	}
	
	// stack 출력 함수
	public void printStack() {
		System.out.println("--- Stack List ---");
		if(top <= 0) {
			System.out.println("stack이 비어잇음");
		}else {
			for(int i=top; i>=0; i--) {			// top->botton 방향 출력
				System.out.println(stk[i]);
			}
		}
	}
}
