package ch05_Ex16; 

public class ArrayEx16 {

	public static void main(String args[]) {
		
		//커맨드 라인을 통해 입력 받기 212페이지
		System.out.println("매개변수의 개수: "+args.length);
	
		for(int i=0; i<args.length; i++) {
			System.out.printf("args[%d] =  %s%n",i,args[i]);
		}
	}
}
