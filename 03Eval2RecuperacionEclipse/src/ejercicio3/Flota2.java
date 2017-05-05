package ejercicio3;

import excepciones.ElementoNoEncontradoException;

import java.util.ArrayList;
import java.util.Set;

import excepciones.DemasiadosKmException;
import excepciones.FlotaLlenaException;

public class Flota2 {
	private ArrayList<Vehiculo> lista;

	public Flota2() {
		this.lista = new ArrayList<>();
	}

	/*
	 * FlotaLlenaException. Añade el vehículo v a la flota a continuación de los
	 * que ya existan. La política de compras de la empresa supone no incorporar
	 * un vehículo que tenga más Km que alguno de los que ya existen, por tanto,
	 * si hubiera en la flota algún vehículo con menos km que el que se va a
	 * añadir se lanzaría DemasiadosKmExeption y el vehículo no se añadiría. Si
	 * el nuevo vehículo no cabe en el array se lanzará FlotaLlenaExcepion. El
	 * método no deberá recorrer más vehículos de los estrictamente necesario
	 */
	public void anyadir(Vehiculo v) throws DemasiadosKmException, FlotaLlenaException {
		boolean enc = false;

		for (int i = 0; i < lista.size() && !enc; i++) {
			if (lista.get(i).getKm() < v.getKm()) {
				enc = true;
			}

		}
		if (enc) {
			throw new DemasiadosKmException("Demasiados km");
		}

		lista.add(v);
	}

	/*
	 * Numero de vehiculos: 4 Vehiculos: 2835 – BBC – 5pz – 40000 Km 1233 – CCC
	 * – 5pz – 34130 Km 1122 – GTC – 4pz – 40100 Km 1324 – DDC – 7pz – 142621 Km
	 * Km totales: 256851 Km
	 */
	public String toString() {
		String resultado = "";
		for (int i = 0; i < lista.size(); i++) {
			resultado += lista.get(i).toString() + "\n";
		}
		return resultado;
	}

	/*
	 * Devuelve el vehículo más adecuado para transportar una carga del peso
	 * indicado. ¿Cuál es el vehículo más adecuado? Aquel cuyo pma se ajusta más
	 * al peso indicado sin que, por supuesto, el peso exceda el pma. En caso de
	 * que no exista ningún vehículo adecuado para el peso indicado el método
	 * devolverá null.
	 */
	public Vehiculo mejorVehiculo(int peso) {
		boolean enc = false;
		int pos = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getPma() >= peso) {
				if (!enc) {
					pos = i;
					enc = true;
				} else {
					if (lista.get(i).getPma() - peso < lista.get(pos).getPma() - peso) {
						pos = i;
					}

				}

			}
		}

		if (enc) {
			return lista.get(pos);
		} else {
			return null;
		}

	}

	/*
	 * Añade al vehículo cuya matrícula se indica (letras y número) los
	 * kilómetros indicados. En caso de no existir un vehículo en la flota con
	 * dicha matrícula se lanzará la excepción)
	 */
	public void anyadirKms(String letrasMatricula, int numeroMatricula, int km) throws ElementoNoEncontradoException {

		boolean encontrado = false;
		int pos = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getLetrasMatricula().equals(letrasMatricula)
					&& lista.get(i).getNumeroMatricula() == numeroMatricula) {
				encontrado = true;
				pos = i;
			}
		}
		if (encontrado) {
			lista.get(pos).setKm(km + lista.get(pos).getKm());
		} else {
			throw new ElementoNoEncontradoException("Elemento no encontrado");
		}

		/* Con esto se necesita el equals y el compareTo */
		// Vehiculo v1 = new Vehiculo(letrasMatricula, numeroMatricula, 0, 0);
		// if (lista.contains(v1)) {
		// int pos = lista.indexOf(v1);
		// lista.get(pos).setKm(km + lista.get(pos).getKm());
		//
		// } else {
		// throw new ElementoNoEncontradoException("No se ha encontrado el
		// elemento");
		// }

	}

}
