package ch06_Ex19;

public class MyMathTest2 {
	public static void main(String args[]) {
		
		//클래스 메서드 호출, 인스턴스 생성 없이 호출가능
		System.out.println(MyMath2.add(200L,100L));
		System.out.println(MyMath2.subtract(200L,100L));
		System.out.println(MyMath2.multiply(200L,100L));
		System.out.println(MyMath2.devide(200L,100L));

		MyMath2 mm = new MyMath2();		//인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		
		//인스턴스 메서드는 객체 생성 후에만 호출이 가능함
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.devide());

		
		
	}
}
