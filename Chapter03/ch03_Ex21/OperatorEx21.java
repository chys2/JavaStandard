package ch03_Ex21;

public class OperatorEx21 {

	public static void main(String[] args) {
		
	System.out.printf("10 == 10.0f \t %b%n", 10==10.0f);		//true
	//10은 int 타입, 10.0f는 float 타입, 10을 float로 변환
	
	System.out.printf("'0' == 0 \t %b%n", '0' == 0);			//false, '0'의 유니코드 48
	System.out.printf("'A' == A \t %b%n", 'A' == 65);			//true, 'A'의 유니코드 65
	System.out.printf("'A' > 'B' \t %b%n", 'A'>'B');			//false, 'A'의 유니코드 65, 'B'의 유니코드 66
	System.out.printf("'A+1' != 'B' \t %b%n", 'A'+1 !='B');		//false, 65+1 != 66
	
	
	}
}
