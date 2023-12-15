package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Function;
import java.util.function.Predicate;

public class Operacoines {

	public static void main(String[] args) {
		List<Integer> enteros = List.of(8,5,-2,4,1,7,12);
		
		print(enteros, x->x%2==0);
		System.out.println("----------");
		print(enteros, x->x<0);
		System.out.println("----------");
		transform(enteros, x->Math.sqrt(x)).forEach(x->System.out.println(x));
	}

	static void print(Collection<Integer> col, Predicate<Integer> pr) {
		for (Integer in:col) {
			if (pr.test(in)) System.out.println(in);
		}
	}
	
	static Collection<Double> transform (Collection<Integer> col, Function<Integer, Double> tx){
		ArrayList<Double> resultado = new ArrayList<Double>();
		for (Integer in:col) resultado.add(tx.apply(in));
		return resultado;
		
	}
}