package ch06_Ex19;


public class MyMath2 {
	long a,b;
	
	
	//매게 변수가 필요 없음
	//a, b는 인스턴스 변수
	long add(){
		long result= a + b;
		return result;
	}
	long subtract( ){
		long result= a - b;
		return result;
	}
	long multiply(){
		long result= a * b;
		return result;
	}
	double devide(){
		double result= a / b;
		return result;
	}
	
	//매개변수만으로 작업이 가능
	//a, b 지역 변수
	static long add(long a, long b){
		long result= a + b;
		return result;
	}
	static long subtract(long a, long b){
		long result= a - b;
		return result;
	}
	static long multiply(long a, long b){
		long result= a * b;
		return result;
	}
	static double devide(double a, double b){
		double result= a / b;
		return result;
	}
}
