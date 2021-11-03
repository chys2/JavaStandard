package ch05_Ex06;

public class ArrayEx06 {
	public static void main(String args[]) {
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(score[i]>max) {		//score[0]과 비교
				max=score[i];		//score[0]이 클시 큰 수를 저장
			}else if(score[i]<min) {//score[0]과 비교
				min=score[i];		////score[0]이 작을시 작은 수를 저장
			}
		}
		
		System.out.println("최대값 :"+ max);
		System.out.println("최소값 :"+ min);

	}
}
