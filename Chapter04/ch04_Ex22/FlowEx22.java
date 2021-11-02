package ch04_Ex22;

public class FlowEx22 {

	public static void main (String args[]) {
		
		int[] arr = {10,20,30,40,50};
		
		int sum = 0;
		
		for(int i =0; i<arr.length; i++) {		//index를 이용하여 arr출력
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		for(int a : arr) {						//for each문으로 출력
			System.out.printf("%d ", a);
			sum += a;
		}
		System.out.println();
		System.out.println("sum="+sum);
	}
}
