package ch05_Ex12; 

public class ArrayEx12 {

	public static void main(String args[]) {
		
		String[] name = new String[] {"Kim","Park","Yi"};
		
		for(int i=0; i< name.length; i++) {
			System.out.printf("name[%d]: %s%n",i,name[i]);		//name[i]에 저장
		}
		
		String tmp = name[2];		//tmp에 name[2]을 저장
		
		System.out.println("tmp: "+tmp);
		
		name[0]="yo";
		
		for(String str:name) {
			System.out.println(str);
		}
	}
}
