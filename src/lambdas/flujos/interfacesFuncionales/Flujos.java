package lambdas.flujos.interfacesFuncionales;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Flujos {

	public static void main(String[] args) {

		int[] valores = { 1, 8, 2, 3, 2, 2, 1, 2, 7, 3, 8, 8, 6, 5, 1, 5, 3 };
		// 1. TRADICIONALMENTE:
		// 1.1 SUMAR TODOS LOS ELEMENTOS DE ESTE ARREGLO

		int suma = 0;
		for (int i : valores) {
			suma += i;
		}
		System.out.println("La suma de todos los elementos del arreglo es: " + suma);

		// 1.2 SUMAR LOS ELEMENTOS PARES DE ESTE ARREGLO

		int sumaPares = 0;
		for (int i : valores) {
			if (i % 2 == 0) {
				sumaPares += i;
			}
		}
		System.out.println("La suma de los elementos pares del arreglo es: " + sumaPares);

		// 2. UTILIZANDO FLUJOS E INTERFACES FUNCIONALES
		// 2.1 SUMAR TODOS LOS ELEMENTOS DE ESTE ARREGLO
		int sumaFlujoSum = IntStream.of(valores).sum();
		System.out.println("La suma de todos los elementos del arreglo utilizando la operación de reducción sum() : "
				+ sumaFlujoSum);
		OptionalInt sumaFlujoreduce = IntStream.of(valores).reduce((x, y) -> x + y);
		System.out.println("La suma de todos los elementos del arreglo utilizando la operación de reducción reduce() : "
				+ (sumaFlujoreduce.isPresent() ? sumaFlujoreduce.getAsInt() : ""));

		// 2.2 SUMAR LOS ELEMENTOS PARES DE ESTE ARREGLO
		int sumaFlujoFilterSum = IntStream.of(valores).filter(x -> x % 2 == 0).sum();
		System.out.println(
				"La suma de todos los elementos parse del arreglo utilizando la operación intermedia filter y de reducción sum() : "
						+ sumaFlujoFilterSum);

	}

}
