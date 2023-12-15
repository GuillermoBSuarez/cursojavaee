package presentacion;

import java.util.Scanner;

import service.Calculadora;

public class ProgramaCalculos {

	public static void main(String[] args) {
		Calculadora cal;
		int n1, n2, opcion;
		Scanner sc = new Scanner(System.in);
		System.out.print("Primer número: ");
		n1 = sc.nextInt();
		System.out.print("Segundo número: ");
		n2 = sc.nextInt();
		cal = new Calculadora(n1, n2);
		
		do {
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Factorial");
			System.out.println("6. Salir");
			opcion = sc.nextInt();
			
			switch (opcion){
				case 1: System.out.println(cal.sumar()); break;
				case 2: System.out.println(cal.restar()); break;
				case 3: System.out.println(cal.multiplicar()); break;
				case 4: System.out.println(cal.dividir()); break;
				case 5:
					System.out.println("Factorial del primero: " + cal.factorial(n1));
					System.out.println("Factorial del segundo: " + cal.factorial(n2));
					break;
				case 6: System.out.println("Chao, pescao");
			}
		} while (opcion != 5);
		
//		System.out.println("Suma: " + cal.sumar());
//		System.out.println("Resta: " + cal.restar());
//		System.out.println("División: " + cal.dividir());
//		System.out.println("Multiplicacion: " + cal.multiplicar());
//		System.out.println("Factorial del primero: " + cal.factorial(n1));
//		System.out.println("Factorial del segundo: " + cal.factorial(n2));
	}

}
