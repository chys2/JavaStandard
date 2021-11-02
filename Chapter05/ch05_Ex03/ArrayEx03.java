package ch05_Ex03;

public class ArrayEx03 {
	public static void main(String args[]) {
		
		int[] arr= new int[5];
		
		//length()는 문자열의 길이
		//size()는 컬렉션프레임워크 타입의 길이
		
		for(int i=0; i<arr.length; i++) {		//배열의 길이
			arr[i]=i+1;		// a[0] 부터 a[4]까지 12345 저장
		}
		System.out.println("[변경 전]");
		System.out.println("arr.length:"+arr.length);		//5
		for(int i=0; i<arr.length; i++) {					
			System.out.printf("arr[%d]:%d%n",i,arr[i]);		//12345출력
		}
		System.out.println();
		int[] tmp=new int[arr.length*2];		//tmp 배열 크기 10
		
		//배열 arr에 저장된 값들을 배열 tmp에 복사
		for(int i=0; i<arr.length; i++) {
			tmp[i]=arr[i];
		}
		
		arr=tmp;
		
		System.out.println("[변경 후]");
		System.out.println("arr.length:"+arr.length);
	
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]:%d%n",i,arr[i]);
		}
	}
}
