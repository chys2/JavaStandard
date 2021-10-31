package ch03_Ex29;

public class OperatorEx29 {

	public static void main(String[] args) {		//124p 참조
		
	byte p = 10;
	byte q = -10;
	
	System.out.printf("p= %d \t\t %s%n", p, toBinaryString(p));
	
	System.out.printf("~p = %d \t\t %s%n", ~p, toBinaryString(~p));
	
	System.out.printf("~p+1= %d \t\t %s%n", ~p+1, toBinaryString(~p+1));
	
	System.out.printf("~~p = %d \t\t %s%n", ~~p, toBinaryString(~~p));
	
	System.out.println();
	
	System.out.printf(" q =%d%n ", q);
	
	System.out.printf(" ~(q-1) =%d%n ", ~(q-1));
	

	}

	private static Object toBinaryString(int x) {  // 10진 정수를 2진수로 변환하는 메서드
		// TODO Auto-generated method stub
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		
		return tmp.substring(tmp.length()-32);
	}
}
