package Chapter02.ch02_Ex07;

public class CharToCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';			//변수 char형 타입의 ch 선언, A저장 
		int code = (int)ch;		//변수 int형 타입의 code 선언, int형 ch저장
		
		System.out.printf("%c = %d (%#X) %n", ch,code,code);		//문자형, 정수형, 16진수형 ch, code, code출력
		
		char hch = '가';			//변수 char형 타입의 hch 선언, 가저장
		System.out.printf("%c = %d(%#X)%n",hch,(int)hch,(int)hch);	//문자형, 정수형, 16진수형 hch, (int)hch, (int)hch출력
		
		int c = '가';
		int a = 'A';
		System.out.println(a);
	}

}
