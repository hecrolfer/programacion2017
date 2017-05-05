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
	 * FlotaLlenaException. A�ade el veh�culo v a la flota a continuaci�n de los
	 * que ya existan. La pol�tica de compras de la empresa supone no incorporar
	 * un veh�culo que tenga m�s Km que alguno de los que ya existen, por tanto,
	 * si hubiera en la flota alg�n veh�culo con menos km que el que se va a
	 * a�adir se lanzar�a DemasiadosKmExeption y el veh�culo no se a�adir�a. Si
	 * el nuevo veh�culo no cabe en el array se lanzar� FlotaLlenaExcepion. El
	 * m�todo no deber� recorrer m�s veh�culos de los estrictamente necesario
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
	 * Numero de vehiculos: 4 Vehiculos: 2835 � BBC � 5pz � 40000 Km 1233 � CCC
	 * � 5pz � 34130 Km 1122 � GTC � 4pz � 40100 Km 1324 � DDC � 7pz � 142621 Km
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
	 * Devuelve el veh�culo m�s adecuado para transportar una carga del peso
	 * indicado. �Cu�l es el veh�culo m�s adecuado? Aquel cuyo pma se ajusta m�s
	 * al peso indicado sin que, por supuesto, el peso exceda el pma. En caso de
	 * que no exista ning�n veh�culo adecuado para el peso indicado el m�todo
	 * devolver� null.
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
	 * A�ade al veh�culo cuya matr�cula se indica (letras y n�mero) los
	 * kil�metros indicados. En caso de no existir un veh�culo en la flota con
	 * dicha matr�cula se lanzar� la excepci�n)
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
