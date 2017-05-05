package test;

import java.util.ArrayList;

import ejercicio3.Flota;
import ejercicio3.Flota2;
import ejercicio3.Vehiculo;
import excepciones.ElementoNoEncontradoException;
import excepciones.DemasiadosKmException;
import excepciones.FlotaLlenaException;

public class TestEjercicio3_2 {
	public static void main(String[] args) {

		Flota2 f2 = new Flota2();
		Vehiculo v1 = new Vehiculo("AAA", 1111, 2000, 40000);
		Vehiculo v2 = new Vehiculo("BBB", 2222, 1500, 30000);
		Vehiculo v3 = new Vehiculo("CCC", 3333, 1750, 20000);
		Vehiculo v4 = new Vehiculo("DDD", 4444, 2300, 10000);
		Vehiculo v5 = new Vehiculo("EEE", 5555, 2000, 30000);
		// --------------------------
		System.out.println("1.- ======= ANYADIR 4 Veh. correctos =======");
		try {
			f2.anyadir(v1);
			f2.anyadir(v2);
			f2.anyadir(v3);
			f2.anyadir(v4);
		} catch (DemasiadosKmException e) {
			System.out.println("Demasiados km al añadir el vehiculo:");
		} catch (FlotaLlenaException e) {
			System.out.println("Flota llena");
		}

		System.out.println(f2);

		// --------------------------
		System.out.println("\n2.- ======= ANYADIR 1 Veh. con demasiados km=======");
		try {
			f2.anyadir(v5);
		} catch (DemasiadosKmException e) {
			System.out.println("Demasiados km al añadir el vehiculo:");
			System.out.println(v5);
			System.out.println("------------");
		} catch (FlotaLlenaException e) {
			System.out.println("Flota llena");
		}
		System.out.println(f2);

		// --------------------------
		System.out.println("\n3.- ======= MEJOR VEHICULO =======");
		int peso = 1870;
		System.out.println("Mejor vehiculo para peso " + peso + ": " + f2.mejorVehiculo(peso));
		peso = 500;
		System.out.println("Mejor vehiculo para peso " + peso + ": " + f2.mejorVehiculo(peso));
		peso = 1500;
		System.out.println("Mejor vehiculo para peso " + peso + ": " + f2.mejorVehiculo(peso));
		peso = 2400;
		System.out.println("Mejor vehiculo para peso " + peso + ": " + f2.mejorVehiculo(peso));

		System.out.println("\n4.- ======= ANYADIR KM =======");
		try {
			f2.anyadirKms("AAA", 1111, 1000);
			f2.anyadirKms("BBB", 2222, 1000);
			f2.anyadirKms("CCC", 3333, 1000);
			f2.anyadirKms("DDD", 4444, 1000);
			System.out.println(f2);
		} catch (ElementoNoEncontradoException e) {
			System.out.println("Elemento no encontrado");
		}

		try {
			f2.anyadirKms("EEE", 5555, 1000);
		} catch (ElementoNoEncontradoException e) {
			System.out.println("Vehiculo EEE-5555 no encontrado");
		}

	}
}
