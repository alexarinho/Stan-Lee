package inicio;

import java.util.Scanner;

public class StanLee {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Scanner leer2 = new Scanner(System.in);
		int numCasos = 0;
		String frase = "";
		String nombre = "stanlee";
		int contador = 0;
		int pos =0;
		
		numCasos = leer.nextInt();
		for (int i = 0; i < numCasos; i++) {
			frase = leer2.nextLine();
			for (int j = 0; j < frase.length(); j++) {
				if(frase.substring(j, j+1).equalsIgnoreCase(nombre.substring(pos, pos+1))) {
					pos++;
				}
				if(pos==nombre.length()) {
					contador++;
					pos=0;
				}
			}	
		}
		System.out.println(contador);
	}
}
