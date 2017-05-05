package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public final static int X = 2;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double media = 0;
		double sumador = 0;
		for (int i = 0; i < X; i++) {
			sumador = 0;
			System.out.println("Equipo " + (i + 1));
			for (int j = 0; j < 5; j++) {
				System.out.println("Estatura " + (j + 1));

				try {
					double estatura = tec.nextDouble();
					sumador += estatura;
					media = sumador / 5;
				} catch (InputMismatchException e) {
					j--;
					System.out.println("Introduce de nuevo");
					tec.nextLine();
				}

			}
			if (media >= 1.95) {
				System.out.println("Equipo Admitido");
			} else {
				System.out.println("Equipo NO ADMITIDO");
			}
		}

	}
}
