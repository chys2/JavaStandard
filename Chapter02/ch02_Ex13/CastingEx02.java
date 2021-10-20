package ch02_Ex13;

public class CastingEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;				//변수 int형 타입의 i 선언, 10저장
		byte b = (byte) i;		//변수 byte형 타입의 b 선언, (byte) i저장
		
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i,b);		//i, b 출력
		
		i = 300;		//i에 300저장
		b = (byte)i;	//b에 (byte)i저장
	
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i,b);		//i, b 출력
		
		b=10;			//b에 10저장
		i=(int)b;		//i에 (int)b저장
		
		System.out.printf("[byte -> int] i=%d -> b=%d%n", b, i);	//i, b 출력
		
		b=-2;			//b에 -2저장
		i=(int)b;		//i에 (int)b저장
		
		System.out.printf("[byte -> int] i=%d -> b=%d%n", b, i);	//i, b 출력
		
		System.out.println("i="+Integer.toBinaryString(i));			//i를 2진수로 변환후 출력(2의 보수법 52p)
	}

}
