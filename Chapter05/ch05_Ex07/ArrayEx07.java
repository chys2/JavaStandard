package ch05_Ex07;

public class ArrayEx07 {
	public static void main(String args[]) {
		
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10);
			
			int tmp = numArr[0];		//numArr[0]과 numArr[n]을 바꾼다
			numArr[0] = numArr[n];
			numArr[n] = tmp;			//numArr[0]과 numArr[n]을 바꾼다
		}
		
		
		  for(int i=0; i<numArr.length; i++) { 
			  System.out.print(numArr[i]); 
		  }
		 

	}
}
