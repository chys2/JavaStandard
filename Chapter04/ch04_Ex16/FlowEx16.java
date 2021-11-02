package ch04_Ex16;

public class FlowEx16 {

	public static void main (String args[]) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}		//직삼각형
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=5; i<=j; j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}		//역직삼각형
	}
}
