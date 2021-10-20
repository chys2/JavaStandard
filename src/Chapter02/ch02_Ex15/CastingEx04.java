package Chapter02.ch02_Ex15;

public class CastingEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 91234567;		//변수 int형 타입의 i 선언, 91234567저장
		float f = (float)i;		//변수 float형 타입의 f 선언, (float)i저장
		int i2 = (int)f;		//변수 int형 타입의 i2 선언, (int)f저장
		
		double d=(double)i;		//변수 double형 타입의 d 선언, (double)i저장
		int i3= (int)d;			//변수 int형 타입의 i3 선언, (int)d저장
		
		float f2 = 1.666f;		//변수 float형 타입의 f2 선언, 1.666저장
		int i4 = (int)f2;		//변수 int형 타입의 i4 선언, (int)f2저장
		
		System.out.printf("i=%d\n", i);		//i 출력
		System.out.printf("f=%f i2=%d\n",f, i2);	//float형 f, int형 i2 출력
		System.out.printf("d=%f i3=%d\n",d, i3);	//float형 d, int형 i3 출력
		System.out.printf("(int)%f=%d\n", f2, i4);	//float형 f2, int형 i4 출력
		
		
	}

}
