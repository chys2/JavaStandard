package ch06_Ex03;


public class TvTest3 {
	public static void main(String args[]) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은" + t1.channel +"번 입니다");
		System.out.println("t2의 channel값은" + t2.channel +"번 입니다");
		
		t2 = t1;		//t1이 저장하고 있는 값(주소)를 t2에 저장한다.
		t1.channel = 7;		//channel 값을 7로 한다.
		System.out.println("t1의 channel 값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은" + t1.channel +"번 입니다");
		System.out.println("t2의 channel값은" + t2.channel +"번 입니다");
		
	}
}
