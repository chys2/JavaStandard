package Chapter02.ch02_Ex03;

public class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";			//변수 String형 타입의 name 선언, Java저장
		String str =name + 8.0;				//변수 Strung형 타입의 str 선언, name과 8.0저장
		
		System.out.println(name);			//name출력
		System.out.println(str);			//str출력
		System.out.println( 7 + " ");		//7출력
		System.out.println(" " + 7);		//공백7출력
		System.out.println(7 + "");			//7출력
		System.out.println(" " + 7);		//7출력
		System.out.println("" + "");		//공백출력
		System.out.println(7+ 7 + "");		//14출력
		System.out.println("" + 7 + 7);		//77출력
	}
}

