package ch05_Ex04;


public class ArrayEx04 {
	public static void main(String args[]) {
		
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		//abc와 num을 붙여서 하나의 배열을 만듬
		char[] result= new char[abc.length+num.length];				

		//abc[0] 에서 result[0]으로  abc.length개의 데이터 복사
		System.arraycopy(abc, 0, result, 0, abc.length);			
		
		System.out.println(result);		//ABCD
	
		//abc[0] 에서 result[4]으로  num.length개의 데이터 복사
		System.arraycopy(num, 0, result, abc.length, num.length);	
		System.out.println(result);		//ABCD0123456789
		
		//abc[0] 에서 num[0]으로  abc.length개의 데이터 복사
		System.arraycopy(abc, 0, num, 0, abc.length);		
		System.out.println(num);		//ABCD456789
		
		//abc[0] 에서 num[6]으로  4개의 데이터 복사
		System.arraycopy(abc, 0, num, 6, 4);
		System.out.println(num);		//ABCD45ABCD
		
	}
}
