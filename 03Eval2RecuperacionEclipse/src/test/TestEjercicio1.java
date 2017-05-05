package test;

import ejercicio1.Ejercicio1;

public class TestEjercicio1 {
	   public static void main(String args[]){
	       //  --- Puedes probar con los siguientes arrays ---------
	       double v1[] = {100,159,175,185,150,200,100,150,100,200}; 
	       double v2[] = {180,150,175,185,200,200,100,175,200,150};
	       double v3[] = {100,200};
	       double v4[] = {120,110,130,140,130,120,110,100,120};
	   
	       System.out.println("Prueba 1: " + Ejercicio1.numeroDePicos(v1));
	       System.out.println("Prueba 2: " + Ejercicio1.numeroDePicos(v2));
	       System.out.println("Prueba 3: " + Ejercicio1.numeroDePicos(v3));
	       System.out.println("Prueba 4: " + Ejercicio1.numeroDePicos(v4));
	   }
}
