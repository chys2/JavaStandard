package ch02_Ex05;

public class PrintfEx02 {

	public static void main(String[] args) {
		
		String url = "www.codechobo.com";		//변수 String형 타입의 url 선언, "www.codechobo.com" 저장
		
		float f1 = .10f;			//변수 float형 타입의 f1 선언, .10f저장 0.10, 1.0e-1
		float f2 = 1e1f;			//변수 float형 타입의 f2 선언, 1e1f저장 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;			//변수 float형 타입의 f3 선언, 3.14e3f저장
		
		double d = 1.23456789;		//변수 double형 d 선언, 1.23456789저장
		
		System.out.printf("f1=%f, %e, %g%n", f1,f1,f1);		//f1 %e지수형태, %g값 간략하게 출력
		System.out.printf("f2=%f, %e, %g%n", f2,f2,f2);		//f2 %e지수형태, %g값 간략하게 출력
		System.out.printf("f3=%f, %e, %g%n", f3,f3,f3);		//f3 %e지수형태, %g값 간략하게 출력
		
		System.out.printf("d=%f%n", d);				//d 출력 소수점 6자리 까지만출력
		System.out.printf("d=%14.10f%n", d);		//전체 14자리 중 소수점 아래 10자리 d 출력 
		
		System.out.printf("[12345678901234567890]%n");		//츨력
		System.out.printf("[%s]%n",url);		//url 출력
		System.out.printf("[%20s]%n",url);		//최소 20글자 출력공간 확보(우측 정렬) url 출력
		System.out.printf("[%-20s]%n",url);		//최소 20글자 출력공간 확보(좌측 정렬) url 출력
		System.out.printf("[%.8s]%n",url);		//왼쪽에서 8글자만 url 출력
		
		
	}

}
