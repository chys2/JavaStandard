package ch03_Ex02;

public class OperatorEx02 {
	public static void main(String[] args) {
		int i=5, j=0;
		
		j=i++;		//5저장
		
		System.out.println("j=i++; 실행 후, i="+i+", j="+j);		//i는 6 j는 5
		
		i=5;
		j=0;
		
		j=++i;
		
		System.out.println("j=++i; 실헹 후, i="+i+", j="+j);		//i는 6 j는 6
		
	}
}
