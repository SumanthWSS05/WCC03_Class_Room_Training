package basics;

public class Calculator {

	public int add(int... a) {
		int sum = 0;
		for(int data : a) {
			sum = sum + data;
		}
		return sum;
	}
	
	public double add(double... a) {
		double sum = 0;
		for(double data : a) {
			sum = sum + data;
		}
		return sum;
	}

	
	public int sub(int a , int b) {
		return a-b;
	}
	
	public int mul(int a , int b) {
		return a*b;
	}
	
	public int div(int a , int b) {
		return a/b;
	}
	
	public void dummy(Calculator... s) {
		
	}
}

