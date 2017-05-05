package ejerciciosPizarra;

public class ejercicio2 {
	public static void main(String[] args) {
		/*
		 * metodo que dado un array de enteros devuelva si cumple o no que todos
		 * los elementos impares aparecen antes que los pares
		 */

		double listaArray[] = {4,1,4,4 };
		boolean zonaPar = false;
		boolean enc = false;

		for (int i = 0; i < listaArray.length && !enc; i++) {
			if (listaArray[i] % 2 == 0) {
				zonaPar = true;
			} else {
				if (zonaPar) {
					enc = true;
				}
			}
		}
		if (enc) {
			System.out.println("No aparecen antes que los pares");
		} else {
			System.out.println("Si aparecen");
		}

	}
}