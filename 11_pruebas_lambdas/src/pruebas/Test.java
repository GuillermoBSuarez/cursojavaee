package pruebas;

import java.time.LocalDate;

interface I1{
	void print(int a);
}

interface I2{
	int cal(String s);
}

interface I3{
	String construct(int a, int b);
}

interface I4{
	boolean test(int a, int b);
}

interface I5{
	int get();
}

interface I6{
	void tx(String a, int b);
}

public class Test {
	public static void main(String[] args) {
		// crear una implementación libre de cada interfaz usando expresiones lambda
		I1 i1 = x -> System.out.println("Pos es "+x);
		I2 i2 = s -> { return s.length(); };
		I3 i3 = (a, b) -> a + "-" + b;
		I4 i4 = (a, b) -> a > b;
		I5 i5 = () -> LocalDate.now().getYear();
		I6 i6 = (a, b) -> {
			for (int i=1; i<=b; i++) System.out.println(i+". "+a);
		};
	}
}