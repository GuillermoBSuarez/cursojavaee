package service;

public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int sumar() {
		return num1+num2;
	}
	
	public int restar() {
		return num1-num2;
	}
	
	public int dividir() {
		return num1/num2;
	}
	
	public int multiplicar() {
		return num1*num2;
	}
	
	public int factorial(int n) {
		int res = 1;
		for (int i=2; i<=n; i++) {
			res*=i;
		}
		return res;
	}
}