package ch02_Ex04;

public class PrintfEx01 {
	public static void main(String[] args) {
		
		byte b =1;			//변수 byte형 타입의 b 선언, 1저장
		short s =2;			//변수 short형 타입의 s 선언, 2저장
		char c = 'A';		//변수 char형 타입의 c 선언, A저장
		
		int finger = 10;						//변수 int형 타입의 finger 선언, 10저장
		long big =100_000_000_000L;				//변수 long형 타입의 big 선언, 100_000_000_000L저장
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;		//변수 long형 타입의 hex 선언, 0xFFFF_FFFF_FFFF_FFFFL저장
		
		int octNum=010;			//변수 int형 타입의 octNum 선언, 010저장		8진수 10, 10진수 8
		int hexNum = 0x10;		//변수 int형 타입의 hexNum 선언, 0x10저장		16진수 10, 10진수 16
		int binNum = 0b10;		//변수 int형 타입의 binNum 선언, 0b10저장		2진수 10, 10진수 2
		
		System.out.printf("b=%d%n",b);		//b 출력
		System.out.printf("s=%d%n",s);		//s 출력
		System.out.printf("c=%c, %d %n",c,(int)c);		//c, int c 출력
		System.out.printf("finger=[%5d]%n",finger);		//5개 공백후 finger출력
		System.out.printf("finger=[%-5d]%n",finger);	//finger후 5개 공백 출력
		System.out.printf("finger=[%05d]%n",finger);	//5자리안에 finger출력
		System.out.printf("big=%d%n",big);				//big 출력
		System.out.printf("hex=%#x%n",hex);				//hex 출력 ,#은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n",octNum,octNum);		//8진수 outNum, 10진수 outNum 출력
		System.out.printf("octNum=%x, %d%n",hexNum,hexNum);		//16진수 hexNum, 10진수 hexNum 출력
		System.out.printf("octNum=%s, %d%n",Integer.toBinaryString(binNum),binNum);		
		//정수를 2진 문자열로 변환 Integer.toBinaryString binNum, 10진수 binNum 출력
	}
}

