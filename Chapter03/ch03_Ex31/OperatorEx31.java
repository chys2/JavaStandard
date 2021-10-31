package ch03_Ex31;

public class OperatorEx31 {

	public static void main(String[] args) {		//128p 참조
		
		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex=%X%n",hex);
		System.out.printf("%X%n",hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	}

}
