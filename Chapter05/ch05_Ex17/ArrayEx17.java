package ch05_Ex17; 

public class ArrayEx17 {

	public static void main(String args[]) {		//213p 
		
		if(args.length !=3) {		//입력값이 3개가 아닐 경우
			System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
			System.exit(0);			//프로그램 종료
		}
		
		int num1 =Integer.parseInt(args[0]);		//문자열을 숫자로 변환
		char op =args[1].charAt(0);					//문자열을 문자(char)로 변환
		int num2 = Integer.parseInt(args[2]);		//문자열을 숫자로 변환
		int result =0;
		
		switch(op) {		//switch문의 수식으로 char 타입의 변수도 가능
		
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case 'x':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("지원되지 않는 연산입니다.");
				
		}
		System.out.println("결과: "+ result);
	}
}
