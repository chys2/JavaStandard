package ch05_Ex08;

public class ArrayEx08 {
	public static void main(String args[]) {
		
		int[] ball = new int[45];
		
		for(int i =0; i<ball.length; i++) {
			ball[i]=i+1;		//인덱스 0부터 44까지 1부터 45까지 저장
		}
		
		int temp=0;				//두 값을 바꾸는데 사용
		
		int j=0;				//임의의 값을 얻어서 저장
		
		for(int i=0; i<6; i++) {
			j =(int)(Math.random()*45);
			
			temp=ball[i]; 		//ball[i]와 ball[j]를 바꾼다
			ball[i]=ball[j];
			ball[j]=temp;		//ball[i]와 ball[j]를 바꾼다
		}
		
		for(int i=0; i<6; i++) {
			System.out.printf("ball [%d]: %d%n",i,ball[i] );
		}
	}
}
