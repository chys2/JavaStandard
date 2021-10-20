package Chapter02.ch02_Ex11;

public class FloatToBinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f = 9.1234567f;				//변수 float형 타입의 f선언, 9.1234567저장
		int i = Float.floatToIntBits(f);	//변수 int형 타입의 i선언, float타입의 값을 int타입의 값으로 반환
		
		System.out.printf("%f%n", f);		//f 출력
		System.out.printf("%X%n", i);		//i 출력
		
	}

}
