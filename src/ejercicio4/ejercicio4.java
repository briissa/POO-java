package ejercicio4;

import java.util.Arrays;

public class ejercicio4 {
	
	private int []numeros = {4,2,3,8,1};
	
	public int numeroMayor() {
		int mayor = numeros [0];
		for (int num: numeros) {
			if (num > mayor) {
				mayor = num; 
			}
		}
		return mayor; 	
	}
	
	public int cantidadNumeros() {
		return numeros.length;
	}
	 
	public double promedioNumeros() {
		int suma=0;
		for (int num : numeros ) {
			suma += num;
		}
		return (double) suma /numeros.length;
	}
	
	public int []numerosOrdAsc (){
		int []copia = Arrays.copyOf(numeros, numeros.length);
		 Arrays.sort(copia);
		 return copia;
	}
	
	
	public int []numerosOrdDesc(){
		int []copia =Arrays.copyOf(numeros, numeros.length);
		Arrays.sort(copia);
		for (int i= 0 ; i < copia.length/2 ; i++) {
			int temp = copia[i];
			copia [i]= copia [copia.length -1-i];
			copia [copia.length -1-i] = temp;
		}
		return copia; 
	}
}
	
