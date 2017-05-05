package test;

import ejercicio3.Flota;
import ejercicio3.Vehiculo;
import excepciones.ElementoNoEncontradoException;
import excepciones.DemasiadosKmException;
import excepciones.FlotaLlenaException;

public class TestEjercicio3 {
	public static void main(String[] args) {
		Flota f = new Flota();
		Vehiculo v1 = new Vehiculo("AAA", 1111, 2000, 40000);
		Vehiculo v2 = new Vehiculo("BBB", 2222, 1500, 30000);
		Vehiculo v3 = new Vehiculo("CCC", 3333, 1750, 20000);
		Vehiculo v4 = new Vehiculo("DDD", 4444, 2300, 10000);
		Vehiculo v5 = new Vehiculo("EEE", 5555, 2000, 30000);
		// --------------------------
		System.out.println("1.- ======= ANYADIR 4 Veh. correctos =======");
		try {
			f.anyadir(v1);
			f.anyadir(v2);
			f.anyadir(v3);
			f.anyadir(v4);
		} catch (DemasiadosKmException e) {
			System.out.println("Demasiados km al añadir el vehiculo:");
		} catch (FlotaLlenaException e) {
			System.out.println("Flota llena");
		}

		System.out.println(f);

		// --------------------------
		System.out.println("\n2.- ======= ANYADIR 1 Veh. con demasiados km=======");
		try {
			f.anyadir(v5);
		} catch (DemasiadosKmException e) {
			System.out.println("Demasiados km al añadir el vehiculo:");
			System.out.println(v5);
			System.out.println("------------");
		} catch (FlotaLlenaException e) {
			System.out.println("Flota llena");
		}
		System.out.println(f);

		// --------------------------
		System.out.println("\n3.- ======= MEJOR VEHICULO =======");
		int peso = 1870;
		System.out.println("Mejor vehiculo para peso " + peso + ": " + f.mejorVehiculo(peso));
		peso = 500;
		System.out.println("Mejor vehiculo para peso " + peso + ": " + f.mejorVehiculo(peso));
		peso = 1500;
		System.out.println("Mejor vehiculo para peso " + peso + ": " + f.mejorVehiculo(peso));
		peso = 2400;
		System.out.println("Mejor vehiculo para peso " + peso + ": " + f.mejorVehiculo(peso));

		System.out.println("\n4.- ======= ANYADIR KM =======");
		try {
			f.anyadirKms("AAA", 1111, 1000);
			f.anyadirKms("BBB", 2222, 1000);
			f.anyadirKms("CCC", 3333, 1000);
			f.anyadirKms("DDD", 4444, 1000);
			System.out.println(f);
		} catch (ElementoNoEncontradoException e) {
			System.out.println("Elemento no encontrado");
		}

		try {
			f.anyadirKms("EEE", 5555, 1000);
		} catch (ElementoNoEncontradoException e) {
			System.out.println("Vehiculo EEE-5555 no encontrado");
		}

	}
}
