package ejercicio1;

public class Ejercicio1 {
	public static int numeroDePicos(double v[]) {
		int contador = 0;
		double ultimaPosicion = v[v.length - 1];
		double penultimaPosicion = v[v.length - 2];
		for (int i = 0; i < v.length - 2; i++) {

			if (v[i + 1] > v[i + 2] && v[i + 1] > v[i]) {
				contador++;
			}

		}
		if (ultimaPosicion > penultimaPosicion) {
			contador++;
		}

		if (v[0] > v[1]) {
			contador++;
		}
		return contador;

	}
}
