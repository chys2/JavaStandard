package ch06_Ex09;

public class PrimitiveParamEx {
	public static void main(String args[]) {

		Data d = new Data();
		d.x=10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
	}
	static void change(int x) {		//기본형 매게변수, 변수의 값을 일기만 할 수 있음(read only)
		x = 1000;		
		System.out.println("change() : x = " +x);		//x=1000적용 안됨
	}
}
