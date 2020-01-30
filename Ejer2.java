package boletinarrays4;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer 5 numeros y mostrarlos en orden inverso al introducido.
		
		//Crear el arreglo cinco de tamaño 5
		int cinco[]= new int [5];
		//Crear el scanner, instancia para el arreglo
		Scanner sc = new Scanner(System.in);
				
		for (int m=0; m<5; m++) { //Primer ciclo for para llenar, leer el arreglo
		System.out.println("Ingrese primer numero"+m);
		cinco [m]= sc.nextInt();
		}
		System.out.println("arreglo original");		
		for (int k=0; k<5; k++) {//Segundo ciclo for para recorrer el arreglo
		System.out.println(cinco [k]); 
		}
		System.out.println("arreglo inverso");
		for (int k=4; k>=0; k--) {//Segundo ciclo for para recorrer el arreglo
		System.out.println(cinco [k]); 
		}


	}

}
