package ch04_Ex22;

public class FlowEx22 {

	public static void main (String args[]) {
		
		int[] arr = {10,20,30,40,50};
		
		int sum = 0;
		
		for(int i =0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		for(int a : arr) {
			System.out.printf("%d ", a);
			sum += a;
		}
		System.out.println();
		System.out.println("sum="+sum);
	}
}
