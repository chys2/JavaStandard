package ch05_Ex11; 

public class ArrayEx11 {

	public static void main(String args[]) {

		int[] numArr = new int[10];
		int[] counter = new int[10] ;
		
		for(int i=0; i<numArr.length; i++) {
			
			numArr[i] = (int)(Math.random()*10);		//랜덤 0 ~ 9 숫자를 numArr[i]에 저장
			
			System.out.print(numArr[i]);
			
		}
		
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
			counter[numArr[i]]++;						//numArr[i]의 값을 counter[numArr[i]]에 대입하여 counter값을 증가시킨다
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println(i+"의 개수" + counter[i]);
		}
	 
	}
}
