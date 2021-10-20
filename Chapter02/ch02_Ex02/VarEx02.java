package ch02_Ex02;

public class VarEx02 {
	public static void main(String[] args) {
		
		int x = 10, y = 20;							//변수 int형 타입의 x 선언 10저장, y선언 20저장 
		int tmp = 0;								//변수 int형 타입의 tmp 선언 0저장
		System.out.println("x:"+x +" y:"+y);		//x, y 출력
		
		tmp = x;									//tmp자리에 x저장
		x = y;										//x자리에 y저장
		y = tmp;									//x자리에 tmp저장
		System.out.println("x:"+x +" y:"+y);		//x, y 출력
	}
}

