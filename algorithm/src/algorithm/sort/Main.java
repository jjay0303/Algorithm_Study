package algorithm.sort;

public class Main {

	public static void main(String[] args) {

		int origin[] = {11, 9 , 2 , 8 , 5 , 1};

		System.out.print("원본 배열 : ");
		printArr(origin);

//		Bubble.bubbleSort(origin);
//		System.out.print("버블 정렬 : ");
		
		Select.selectSort(origin);
		System.out.print("선택 정렬 : ");
		printArr(origin);

	}
	
	// 정렬 출력 함수
	private static void printArr(int[] arr) {
			for(int data : arr) {
				System.out.print(data + " ");
			}
			System.out.println("");
	}

}
