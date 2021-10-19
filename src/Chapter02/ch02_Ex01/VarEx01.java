package Chapter02.ch02_Ex01;

public class VarEx01 {
	public static void main(String[] args) {
		
		int year = 0;					//변수 int형 타입의 year 선언, 0저장
		int age = 14;					//변수 int형 타입의 age 선언, 14저장
		
		System.out.println(year);		//year 출력
		System.out.println(age);		//age 출력
		
		year = age + 2000;				//변수 age의 값에 2000을 더해서 year에저장
		age = age + 1;					//변수 age의 값에 1을 더해서 age에저장
		
		System.out.println(year);		//year 출력
		System.out.println(age);		//age 출력
	}
}

