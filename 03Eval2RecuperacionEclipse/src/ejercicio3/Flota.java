package ejercicio3;

import excepciones.ElementoNoEncontradoException;

import java.util.Set;

import excepciones.DemasiadosKmException;
import excepciones.FlotaLlenaException;

public class Flota {
	public final static int MAX = 20;
	private Vehiculo[] lista;
	private int numVehiculos;

	public Flota() {
		this.lista = new Vehiculo[MAX];
		this.numVehiculos = 0;
	}

	public void anyadir(Vehiculo v) throws DemasiadosKmException, FlotaLlenaException {
		boolean enc = false;
		for (int i = 0; i < numVehiculos && !enc; i++) {
			if (lista[i].getKm() < v.getKm()) {
				enc = true;

			}
		}
		if (enc) {
			throw new DemasiadosKmException("Demasiados kilometros");
		}

		if (numVehiculos == lista.length) {
			throw new FlotaLlenaException("La plantilla está completa");
		}

		lista[numVehiculos] = v;
		numVehiculos++;

	}

	public String toString() {
		String resultado = "";
		double total = 0;
		resultado += "Número de vehículos: " + numVehiculos + "\n";
		for (int i = 0; i < numVehiculos; i++) {
			resultado += lista[i].toString() + "\n";
			total += lista[i].getKm();
		}
		resultado += "Km totales: " + total;
		return resultado;

	}

	public Vehiculo mejorVehiculo(int peso) {

		boolean enc = false;
		int pos = 0;
		for (int i = 0; i < numVehiculos; i++) {
			if (lista[i].getPma() >= peso) {
				if (!enc) {
					pos = i;
					enc = true;
				} else {
					if (lista[i].getPma() - peso < lista[pos].getPma() - peso) {
						pos = i;
					}

				}

			}
		}

		if (enc) {
			return lista[pos];
		} else {
			return null;
		}

	}

	public void anyadirKms(String letrasMatricula, int numeroMatricula, int km) throws ElementoNoEncontradoException {

		boolean encontrado = false;
		int pos = 0;

		for (int i = 0; i < numVehiculos && !encontrado; i++) {

			if (lista[i].getLetrasMatricula().equals(letrasMatricula)
					&& lista[i].getNumeroMatricula() == numeroMatricula) {
				encontrado = true;
				pos = i;
			}
		}
		if (encontrado) {
			// lista[pos].setKm(km);
			lista[pos].setKm(lista[pos].getKm() + km);

		} else {
			throw new ElementoNoEncontradoException("No se ha encontrado el vehículo que buscabas");
		}

	}

}
