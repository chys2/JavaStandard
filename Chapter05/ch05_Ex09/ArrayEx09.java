package ch05_Ex09;

import java.util.Arrays;

public class ArrayEx09 {
	public static void main(String args[]) {
		
		int[] code = {-4,-1,3,6,11};
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random()*code.length);		//0부터 4 발생
			
			arr[i]=code[tmp];		//arr 배열에 code[tmp]의 랜덤 인덱스 값에 있는 데이터 저장
		}
		System.out.print(Arrays.toString(arr));
	}
}
