package ch02_Ex09;

public class OverflowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		short sMin = -32768;		//변수 short형 타입의 sMin 선언, -32768저장(최소값)
		short sMax = 32767;			//변수 short형 타입의 sMax 선언, 32767저장(최대값)	
		char cMin=0;				//변수 char형 타입의 cMin 선언, 0저장(최소값)	
		char cMax=65535;			//변수 char형 타입의 cMax 선언, 65535저장(최대값)	
		
		System.out.println("sMin = " + sMin);	//sMin출력
		System.out.println("sMin-1 = " + (short)(sMin-1));		//최소값 -1 = 최대값
		System.out.println("sMax = " + sMax);	//sMax출력
		System.out.println("sMax+1 = " + (short)(sMax+1));		//최대값 +1 = 최소값
		
		System.out.println("cMin = " + (int)cMin);		//cMin출력
		System.out.println("cMin-1 = " + (int)--cMin);	//최소값 -1 = 최대값
		System.out.println("cMax = " + (int)cMax);		//cMax출력
		System.out.println("cMax+1 = " + (int)++cMax);	//최대값 +1 = 최소값
	}

}
