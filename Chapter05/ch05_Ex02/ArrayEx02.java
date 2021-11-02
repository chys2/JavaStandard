package ch05_Ex02;

import java.util.Arrays;

public class ArrayEx02 {
	public static void main(String args[]) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100,95,80,70,60};
		char[] chArr= {'a','b','c','d'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i +1;							//배열 인덱스에 데이터 저장
		}
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;		//배열 인덱스에 데이터 저장
		}
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2));		//랜덤 데이터가 들어있는 배열
		System.out.println(Arrays.toString(iArr3));		//100, 95, 80, 70, 60 데이터가 들어있는 배열
		System.out.println(Arrays.toString(chArr));		//abcd
		System.out.println(iArr3);						//실행 할때마다 달라질수 있음
		System.out.println(chArr);						//abcd
		
	}
}
