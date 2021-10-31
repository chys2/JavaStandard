package ch03_Ex24;

public class OperatorEx24 {

	public static void main(String[] args) {
		
		int x = 0;
		
		char ch = ' ';
		
		x=15;
		
		System.out.printf("x=%2d,10 < x && x < 20 = %b%n", x , 10 < x && x < 20);	//ture
		
		x=6;
		System.out.printf("x=%2d,x%%2==0 || x%%3==0 && x%%6!=0 =%b%n",  x , x%2==0 || x%3==0 && x%6!= 0);		//true 뒤에 있는 AND(&&)연산자가 우선순위가 더 높기 때문
		
		System.out.printf("x=%2d,(x%%2==0 || x%%3==0) && x%%6!=0 =%b%n", x , (x%2==0 || x%3==0) &&x%6!=0);		//false
		
		
		ch='1';		//49
		System.out.printf("ch='%c,'0' <=ch && ch <='9' =%b%n", ch,'0' <=ch && ch <='9' );		//true
	
		ch='a';		//97
		System.out.printf("ch='%c,'a' <=ch && ch <='z' =%b%n", ch,'a' <=ch && ch <='z' );		//true
	
		ch='A';		//65
		System.out.printf("ch='%c,'A' <=ch && ch <='Z' =%b%n", ch,'A' <=ch && ch <='Z' );		//true
		
		ch='q';
		System.out.printf("ch='%c,ch=='q' || ch =='Q' =%b%n", ch,'q' ==ch || ch =='Q' );		//true
	
	
	}
}
