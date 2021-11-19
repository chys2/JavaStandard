package ch05_Ex18; 

public class ArrayEx18 {

	public static void main(String args[]) {
		
		int[][] score= new int[][] {		//score[i][j]
			{100,100,100},
			{20,20,20},
			{30,30,30},
			{40,40,40}
		};
		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d%n",i,j,score[i][j]);		//행과 열에 해당하는 숫자 출력
			}
			
		}
		
		for(int[] tmp:score) {		//score의 각 요소(1차원 배열 주소)를 tmp에 저장
			for(int i : tmp) {		//tmp는 1차원 배열을 가르키는 참조변수
				sum += i;
			}
		}
		System.out.println("sum="+sum);
	}
}
