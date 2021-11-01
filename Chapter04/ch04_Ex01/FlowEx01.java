package ch04_Ex01;

public class FlowEx01 {

	public static void main (String args[]) {
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은%n ",x);		//0
		
		if(x == 0 ) System.out.println("x==0");				//출력
		if(x != 0 ) System.out.println("x!=0");
		if(!(x == 0) ) System.out.println("!(x==0)");		
		if(!(x != 0) ) System.out.println("!(x!=0)");		//출력
	
		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은%n ",x);		//1
		if(x == 0 ) System.out.println("x==0");
		if(x != 0 ) System.out.println("x!=0");				//출력
		if(!(x == 0) ) System.out.println("!(x==0)");		//출력
		if(!(x != 0) ) System.out.println("!(x!=0)");
	}
}
