package ch05_Ex05;

public class ArrayEx05 {
	public static void main(String args[]) {
		
		int sum =0;
		float average =0f;
		
		int [] score = {100,88,100,100,90};
		
		for(int i=0; i<score.length; i++) {
			sum+=score[i];		//score를 다 더함
		}
		
		average = (float)sum/score.length;		//더한 점수를 평균을 만듬
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average);
	}
}
