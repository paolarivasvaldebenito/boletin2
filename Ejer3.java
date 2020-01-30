package boletinarrays4;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer cinco numeros por teclado y a continuacion realizar la media de los numeros positivos 
		// la media de los negativos y contar el numero de ceros.
		
		
	int cinco[]= new int [5]; ////Crear el arreglo cinco de tamaño 5
				
	Scanner sc = new Scanner(System.in); ////Crear el scanner, instancia para el arreglo
						
	for (int m=0; m<5; m++ ) { //Primer ciclo for para llenar, leer el arreglo
	System.out.println("Ingrese primer numero");
	cinco [m]= sc.nextInt();
		
	}
	
	int cont1=0, cont2=1, cont3=0; 
	int suma1=0, suma2=0;
	
	for (int m=0; m<5; m++ ) { //Segundo ciclo for para recorrer el arreglo
	if (cinco[m]>0 ) {
		
		suma1=suma1+1; 
		cont1++;
	}
	
	else if (cinco[m]<0) {
		suma2=suma2+1; 
		cont2++;
	}
	
	else {
		cont3++;
		
	}
	}
	System.out.println("El promedio de los numeros positivos es : "+(float)(suma1/cont1));
	System.out.println("El promedioa de los numeros negativoss es : "+(float)(suma2/cont2));
	System.out.println("La cantidad de ceros es : "+cont3);
	
	
}}
