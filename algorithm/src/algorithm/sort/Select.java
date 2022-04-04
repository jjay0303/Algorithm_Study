package algorithm.sort;

public class Select {
	
	public static void selectSort(int[] arr) {
		
		int min = 0;		// 최소값 인덱스 
		int temp = 0;		// 최소값 넣어둘 변수
		
		for(int i=0; i<arr.length-1; i++) {
			min = i;			// 최소값 인덱스를 i로 임의 지정
			
			for(int j=i; j<arr.length; j++) {
				if(arr[j] < arr[min]) {	
					min = j;	//인덱스 i에 해당하는 값보다 작은 값의 인덱스를 최소값 인덱스에 대입
				}
			}

			temp = arr[min];	// 최소값 교환
			arr[min] = arr[i];
			arr[i] = temp;
			
		}

	}

}
