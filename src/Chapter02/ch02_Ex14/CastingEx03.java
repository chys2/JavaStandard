package Chapter02.ch02_Ex14;

public class CastingEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f = 9.1234567f;		//변수 float형 타입의 f 선언, 9.1234567저장
		double d = 9.1234567;		//변수 double형 타입의 d 선언, 9.1234567저장
		double d2 = (double)f;		//변수 double형 타입의 d2 선언,  (double)f저장
		
		System.out.printf("f =%20.18f\n", f);		//전체 20자리 중 18자리는 소수점 이하의 수를 출력, 소수점 6자리까지는 오차없이 저장
		System.out.printf("d =%20.18f\n", d);		//전체 20자리 중 18자리는 소수점 이하의 수를 출력
		System.out.printf("d2=%20.18f\n", d2);		//전체 20자리 중 18자리는 소수점 이하의 수를 출력, 소수점 6자리까지는 오차없이 저장
		//저장할때 이미 값이 달라졌기때문에, 형변환을 해도 값이 같아지지 않는다.
		
	}

}
