package trazas;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio2 {
	public static void main(String args[]) {
		Scanner tec = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Alumno " + i);
			for (int j = 1; j <= 3; j++) {
				try {
					System.out.print("Asignatura " + j);
					int nota = tec.nextInt();
				} catch (InputMismatchException e) {
					System.out.print("Las notas deben ser numéricas");
					tec.nextLine();
					j--;
				}
			}
		}
	}
}