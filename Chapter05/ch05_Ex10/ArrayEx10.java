package ch05_Ex10;

public class ArrayEx10 {
	public static void main(String args[]) {
		
		int[] numArr= new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed= false;
			
			for(int j=0; j<numArr.length-1-i; j++) {
				
				if(numArr[j]>numArr[j+1]) {
				
					int temp = numArr[j];		//임시 저장, numArr[j]와 numArr[j+1] 바꾼다
					
					numArr[j] = numArr[j+1];
					
					numArr[j+1] = temp;			//임시 저장한 데이터를 새로운 저장소에 저장, numArr[j]와 numArr[j+1] 바꾼다
					
					changed = true;
				}
			}
			
			if(!changed) break;		//해당하는 반복문 탈출
			
			for(int k=0; k<numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
	}
}
