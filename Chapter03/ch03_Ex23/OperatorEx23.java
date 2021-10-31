package ch03_Ex23;

public class OperatorEx23 {

	public static void main(String[] args) {
		
	String str1 = "abc";
	String str2 = new String("abc");
	
	System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");		//true
	System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");			//true
	System.out.printf("str2==\"abc\" ? %b%n", str2=="abc");			//false, 내용은 같지만 다른 객체
	System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));	//true
	System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));	//true
	System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));	//false
	
	System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));		//true, 대소문자 구별하지 않고 비교하고 싶으면 equalsIgnoreCase 사용
	
	
	
	
	
	}
}
