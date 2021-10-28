package ch04_Ex29;

public class FlowEx29 {

	public static void main (String args[]) {
		
		for(int i=1; i<=100; i++) {
			System.out.printf("i=%d ", i);
			int tmp = i;
			do {
				if(tmp%3%10 ==0 && tmp%10 !=0) {
					System.out.print("¦");
				}
			}while ((tmp/=10)!=0);
			System.out.println();			
		}

	}
}
