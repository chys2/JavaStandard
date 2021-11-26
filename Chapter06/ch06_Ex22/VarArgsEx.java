package ch06_Ex22;

public class VarArgsEx {
	public static void main(String args[]) {
		String[] strArr = {"100","200","300"};
		
		System.out.println(concatenate("","100","200","300"));
		System.out.println(concatenate("-",strArr));
		System.out.println(concatenate(",",new String[] {"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");

	}	
	static String concatenate(String delim,String... args) {		//문자열 개수의 제약 없이 매개변수로지정
		String result="";
		for(String str:args) {
			result += str+delim;
		}
		return result;
	}
	/*
	 * static String concatenate(String... args) { return concatenate("", args); }
	 */
}
