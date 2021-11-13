package ch05_Ex13; 

public class ArrayEx13 {

	public static void main(String args[]) {
		
		char[] hex=new char[] {'C','A','F','E'};		//67, 65, 69, 70 
 	
		String[] binary = {"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000", "1001","1010","1011",
				"1100", "1101", "1110", "1111"};
		
		String result="";
		//16진수를 2진수로 변환하는 예제
		for(int i=0; i<hex.length; i++) {
			if(hex[i]>='0' && hex[i]<='9') {
				result +=binary[hex[i]-'0'];		//'8'-'0'의 결과는  8
			}else {		//A ~ F면
				result +=binary[hex[i]-'A'+10];		//'C' - 'A' = 67 - 65
			}
		}
		System.out.println("hex: "+ new String(hex));
		System.out.println("binary: "+ result);
	}
}
