package algorithm.sort;

public class Bubble {
	
	public static void bubbleSort(int[] arr){
		
		int temp = 0;
	
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length - 1 - i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
}

}
