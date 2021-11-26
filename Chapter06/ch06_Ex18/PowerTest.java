package ch06_Ex18;

public class PowerTest {
	public static void main(String args[]) {
		
		int x = 2;
		int y = 5;
		
		long result = 0;
		
		for(int i =1; i<=y; i++) {
			result += power(x, i);
		}
		System.out.println(result);
		
	}
	static long power (int x, int y) {
		if (y==1) {
			return x;
		}
		return x * power(x, y -1);
	}
}
