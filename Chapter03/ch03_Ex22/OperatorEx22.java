package ch03_Ex22;

public class OperatorEx22 {

	public static void main(String[] args) {
		
	float f = 0.1f;
	double d = 0.1;
	double d2 = (double)f;
	
	System.out.printf("10.0==10.0f %b%n",10.0 == 10.0f);		//true
	System.out.printf("0.1==0.1f %b%n",0.1 == 0.1f);			//false, 실수형은 근사값의 저장되므로 오차가 발생할수 있기 때문이다
	System.out.printf("f=%19.17f%n",f);							
	System.out.printf("d=%19.17f%n",d);
	System.out.printf("d2=%19.17f%n",d2);
	
	System.out.printf("d==f %b%n",d==f);		//false
	System.out.printf("d==d2 %b%n", d==d2);		//false
	System.out.printf("d2==f %b%n",d2==f);		//true
	System.out.printf("(float)d==f %b%n",(float)d==f);	//true
	
	
	
	
	}
}
