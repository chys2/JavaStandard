package ch05_Ex04;


public class ArrayEx04 {
	public static void main(String args[]) {
		
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		char[] result= new char[abc.length+num.length];	//abc와 num을 붙여서 하나의 배열을 만듬
		System.arraycopy(abc, 0, result, 0, abc.length);
		
		System.out.println(result);
	
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		System.arraycopy(abc, 0, num, 6, 4);
		System.out.println(num);
		
	}
}
