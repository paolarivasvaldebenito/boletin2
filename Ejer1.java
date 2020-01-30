package boletinarrays4;

import java.util.Scanner;
//Leer 5 numeros y mostrarlos en el mismo orden introducido.

public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear el arreglo cinco de tamaño 5
		float cinco[]= new float [5];
		//Crear el scanner, instancia para el arreglo
		Scanner sc = new Scanner(System.in);
		
		for (int m=0; m<5; m++) { //Primer ciclo for para llenar, leer el arreglo
			System.out.println("Ingrese valor :"+(m+1));
			cinco [m]= sc.nextFloat();
		}
		
		for (int k=0; k<5; k++) {//Segundo ciclo for para recorrer el arreglo
			System.out.println("Los elementos son: " +cinco [k]); 
		}
	}

}
