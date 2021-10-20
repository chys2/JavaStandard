package ch02_Ex10;

public class FloatEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f  =  9.12345678901234567890f;	//변수 float형 타입의 f 선언, 9.12345678901234567890저장
		float f2 =  1.2345679901234567890f;		//변수 float형 타입의 f2 선언, 1.2345678901234567890저장
		double d = 9.12345678901234567890d;		//변수 double d 선언, 9.12345678901234567890저장
		
		System.out.printf("       123456789012345678901234%n");		//출력
		System.out.printf("f  : %f%n",f);			//소수점 이하 6자리까지 출력
		System.out.printf("f  :%24.20f%n",f);		//전체 24자리 중 20자리는 소수점 이하의 수를 출력, 소수점 6자리까지는 오차없이 저장
		System.out.printf("f2 :%24.20f%n",f2);		//전체 24자리 중 20자리는 소수점 이하의 수를 출력, 소수점 6자리까지는 오차없이 저장
		System.out.printf("d  :%24.20f%n",d);;		//전체 24자리 중 20자리는 소수점 이하의 수를 출력, 소수점 15자리까지는 오차없이 저장
		
	}

}
