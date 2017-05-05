package ejercicio3;

public class Vehiculo {
	private String letrasMatricula;
	private int numeroMatricula;
	private int pma;
	private int km;

	public Vehiculo(String letras, int numero, int pma, int km) {
		this.letrasMatricula = letras;
		this.numeroMatricula = numero;
		this.pma = pma;
		this.km = km;
	}

	public String getLetrasMatricula() {
		return letrasMatricula;
	}

	public void setLetrasMatricula(String letrasMatricula) {
		this.letrasMatricula = letrasMatricula;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public int getPma() {
		return pma;
	}

	public void setPma(int pma) {
		this.pma = pma;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Vehiculo)) {
			return false;
		}

		Vehiculo v = (Vehiculo) o;

		if (this.letrasMatricula.equals(v.letrasMatricula) && this.numeroMatricula == v.numeroMatricula) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Object o) {
		Vehiculo v = (Vehiculo) o;
		if (this.letrasMatricula.compareTo(v.letrasMatricula) > 0) {
			return 1;
		} else if (this.letrasMatricula.compareTo(v.letrasMatricula) < 0) {
			return -1;

		} else {
			if (this.numeroMatricula > v.numeroMatricula) {
				return 1;
			}
			if (this.numeroMatricula < v.numeroMatricula) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	@Override
	public String toString() {
		return String.format("%d - %s - %d kg - %d km", numeroMatricula, letrasMatricula, pma, km);
	}
}
