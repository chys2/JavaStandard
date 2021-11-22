package ch06_Ex10;

public class ReferenceParamEx {
	public static void main(String args[]) {

		Data d = new Data();
		d.x=10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		
	}
	static void change(Data d) {		//참조형 매게변수, 변수의 값을 읽고 변경 가능(read & write)
		d.x = 1000;
		System.out.println("change() : x = " +d.x);		//x의 값이 변경
	}
}
