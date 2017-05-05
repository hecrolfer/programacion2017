package ejerciciosPizarra;

public class ejercicio2Mio {
	public static void main(String[] args) {
		/*
		 * metodo que dado un array de enteros devuelva si cumple o no que todos
		 * los elementos impares aparecen antes que los pares
		 */

		double listaArray[] = { 1,1,1,1,3,3,3,3,8,2,1 };
		if (cumplePares(listaArray)){
			System.out.println("No se cumple");
		}else{
			System.out.println("Se cumple");
		}
	}

	public static boolean cumplePares(double v[]) {
		boolean zonaPar = false;
		boolean encontrado = false;
		for (int i = 0; i < v.length; i++) {
			if (v[i]%2==0){
				zonaPar = true;
			}else{
				zonaPar = false;
			}
			
			if(zonaPar){
				encontrado = true;
			}else{
				encontrado = false;
			}
			
		}
		if(encontrado){
			return false;
		}else{
			return true;
		}
		
		
		
	}

}
