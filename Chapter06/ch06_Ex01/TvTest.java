package ch06_Ex01;

public class TvTest {
	public static void main(String args[]) {
		
		Tv t;		//Tv 인스턴스를 참조하기 위한 변수 t선언
		t = new Tv();		//Tv 인스턴스 생성
		t.channel = 7;		//channel의 값을 7로 설정
		t.channelDown();	//channelDown() 호출
		
		System.out.println("현재 채널은 "+t.channel+"번 입니다");
		
	}
}
