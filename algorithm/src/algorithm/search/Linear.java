package algorithm.search;

import java.util.Scanner;

public class Linear {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 : ");
		int num = sc.nextInt();
		int[] array = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("입력할 값 : ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("생성된 배열 : ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n검색할 값 : ");
		int search = sc.nextInt();
		
		int result = linearSearch(array, search);
		if(result > 0) {
			System.out.println(search + "는 배열의 " + (result + 1) + "번째에 있습니다.");
		}else {
			System.out.println(search + "는 배열에 없는 값입니다.");
		}
		
	}
	
	public static int linearSearch(int arr[], int s) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == s) {
				return i;
			}
		}
		return -1;
	}

}
