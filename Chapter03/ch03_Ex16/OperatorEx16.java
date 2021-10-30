package ch03_Ex16;

public class OperatorEx16 {

	public static void main(String[] args) {
		
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000);		//3141.0
		System.out.println(shortPi);
		
		shortPi = (int)(pi * 1000)/1000f;		//3.141
		System.out.println(shortPi);
	}
}
