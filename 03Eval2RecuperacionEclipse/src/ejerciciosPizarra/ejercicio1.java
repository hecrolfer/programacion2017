package ejerciciosPizarra;

public class ejercicio1 {
	/*
	 * Metodo que dado un array de enteros devuelva si está o no ordenado
	 * crecientemente
	 */

	public static void main(String[] args) {
		double listaArrays[] = { 91, 8, 20, 30, 30, 35 };

		if (listaOrdenada2(listaArrays)) {
			System.out.println("Está ordenado crecientemente");
		} else {
			System.out.println("Está desordenado");
		}

	}

	public static boolean listaOrdenada(double v[]) {
		boolean encontrado = false;
		for (int i = 1; i < v.length && !encontrado; i++) {
			if (v[i] < v[i - 1]) {
				encontrado = true;
			}
		}

		if (encontrado) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean listaOrdenada2(double v[]) {
		boolean encontrado = false;
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] > v[i + 1]) {
				encontrado = true;
			}
		}
		if (encontrado) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * Método que dado un array de enteros devuelva si cumple o no que todos los
	 * elementos impares apareecen antes que los pares
	 */

}
