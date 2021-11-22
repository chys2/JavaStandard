package ch06_Ex12;

public class ReferenceParamEx3 {
	public static void main(String args[]) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);		//배열의 모든 요소 출력
		sortArr(arr);		//오름차순 배열 정렬
		printArr(arr);		//배열의 모든 요소 출력
		sortReverse(arr);	//내림차순 배열 정렬
		printArr(arr);		//배열의 모든 요소 출력
		System.out.println("sum= "+ sumArr(arr));		//배열의 총합을 출력
		
	}

	static void sortArr(int[] arr) {		//배열의 오름차순으로 정렬
		System.out.print("오름차순");
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; i<arr.length-1-j; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp ;
				}
			}
		}
	}

	static void sortReverse(int[] arr) {		//배열의 내림차순으로 정렬
		System.out.print("내름차순");
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; i<arr.length-1-j; j++) {
				if(arr[j+1]>arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp ;
				}
			}
		}
	}
	
	static void printArr(int[] arr) {		//배열의 모든 요소를 출력
		
		System.out.print("[");
		for(int i : arr) {
			System.out.print(i+", ");
		}
		System.out.println("]");
	}

	static int sumArr(int[] arr) {		//배열의 모든 요소의 합
	
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
