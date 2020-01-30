package boletinarrays4;

import java.util.Scanner;

public class Ejer4 {
	// Leer 10 numeros enteros. Debemos mostrar en el siguiente orden: 
    // el primero, el ultimo, el segundo, el penultimo, el tercero, etc.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int ten[] = new int[10]; //Creacion del arreglo cinco tamaño 10
	Scanner sc = new Scanner(System.in); //Creo la instancia para agregar objetos
	
	
	for(int i=0; i<10; i++) {
		System.out.println("Ingrese numero: "+(i+1));
		ten[i]=sc.nextInt();
	}
	
	for(int i=0; i<5; i++) {
		System.out.println("El indice "+i+"Contiene el numero: " +ten[i]);
		System.out.println("El indice "+(9-i)+"Contiene el numero: " +ten[9-i]);
	}
  }

}
