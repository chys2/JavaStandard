package ch03_Ex30;

public class OperatorEx30 {

	private static Object toBinaryString(int x) {  //10진 정수를 2진수로 변환하는 메서드
		// TODO Auto-generated method stub
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		
		return tmp.substring(tmp.length()-32);
	}

	public static void main(String[] args) {		//127p 참조
		
		int dec = 8;
		
		System.out.printf("%d >> %d = %4d \t%s%n",dec, 0 , dec>>0,toBinaryString(dec>>0));
	
		System.out.printf("%d >> %d = %4d \t%s%n",dec, 1 , dec>>1,toBinaryString(dec>>1));

		System.out.printf("%d >> %d = %4d \t%s%n",dec, 2 , dec>>2,toBinaryString(dec>>2));
		
		System.out.printf("%d << %d = %4d \t%s%n",dec, 0 , dec<<0,toBinaryString(dec<<0));
		
		System.out.printf("%d << %d = %4d \t%s%n",dec, 1 , dec<<1,toBinaryString(dec<<1));
		
		System.out.printf("%d << %d = %4d \t%s%n",dec, 2 , dec<<2,toBinaryString(dec<<2));
		
		System.out.println();
		
		dec = -8;
		
		System.out.printf("%d >> %d = %4d \t%s%n",dec, 0 , dec>>0,toBinaryString(dec>>0));
	
		System.out.printf("%d >> %d = %4d \t%s%n",dec, 1 , dec>>1,toBinaryString(dec>>1));

		System.out.printf("%d >> %d = %4d \t%s%n",dec, 2 , dec>>2,toBinaryString(dec>>2));
		
		System.out.printf("%d << %d = %4d \t%s%n",dec, 0 , dec<<0,toBinaryString(dec<<0));
		
		System.out.printf("%d << %d = %4d \t%s%n",dec, 1 , dec<<1,toBinaryString(dec<<1));
		
		System.out.printf("%d << %d = %4d \t%s%n",dec, 2 , dec<<2,toBinaryString(dec<<2));
		
		System.out.println();
		
		dec = 8;
		
		System.out.printf("%d >> %d = %2d \t%s%n",dec, 0 , dec>>0,toBinaryString(dec>>0));
	
		System.out.printf("%d >> %d = %2d \t%s%n",dec, 32 , dec>>32,toBinaryString(dec>>32));

		
		
	}

}
