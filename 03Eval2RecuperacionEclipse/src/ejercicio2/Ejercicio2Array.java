package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2Array {

	public final static int X = 2;

	public final static int x = 2;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double estaturas[] = new double[5];
		double media = 0;

		for (int equipo = 0; equipo < x; equipo++) {
			System.out.println("Equipo " + (equipo + 1) + ": ");
			double totalestaturas = 0;
			int cont = 0;
			boolean esCorrecto = true;
			for (int i = 0; i < estaturas.length; i++) {
				System.out.println("Introduce la estatura del jugador " + (cont + 1) + ":");

				do {

					try {
						double estatura = tec.nextDouble();
						estaturas[i] = estatura;
						totalestaturas = estatura + totalestaturas;
						esCorrecto = true;
						cont++;
					} catch (InputMismatchException e) {
						System.out.println("Tienes que introducir un numero");
						esCorrecto = false;
						tec.nextLine();

					}

				} while (!esCorrecto);

			}
			media = totalestaturas / estaturas.length;

			if (media >= 1.95) {
				System.out.println("ADMITIDO");
			} else
				System.out.println("NO ADMITIDO");
		}
	}
}
