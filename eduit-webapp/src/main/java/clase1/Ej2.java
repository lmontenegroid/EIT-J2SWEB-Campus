package clase1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		//1) Declare e inicie 3 variables enteras y compare cual de las 3 es la mayor.
		/* BORRAR
		double n1 = 50;
		double n2 = 33.333;
		double n3 = 49.9;
		
		double maximo = Math.max(n1,(Math.max(n2, n3)));
		
		System.out.println("Primer n�mero = " +n1);
		System.out.println("Segundo n�mero = " +n2);
		System.out.println("Tercer n�mero = " +n3+ '\n');
		System.out.println("El mayor de los 3 n�meros es: " +maximo);
		
		BORRAR */
		
		//2) Declare e inicie 2 variables que permitan realizar y mostrar en consola 
		//las operaciones b�sicas matem�ticas (suma, resta,
		//divisi�n y multiplicaci�n) pero con la opci�n de elegir cual operaci�n realizar
		
		double n1 = 50;
		double n2 = 25;
		
		System.out.println("Primer n�mero = " +n1);
		System.out.println("Segundo n�mero = " +n2+ '\n');
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la operaci�n a realizar (suma, resta, multi o div)");
		String opcion = teclado.next();
		
		switch(opcion) {
			case "suma":
				System.out.println(n1+n2);
				break;
			case "resta":
				System.out.println(n1-n2);
				break;
			case "multi":
				System.out.println(n1*n2);
				break;
			case "div":
				System.out.println(n1/n2);
				break;
			default:
				System.out.println("Escribiste cualquier cosa");
		}
		
		teclado.close();
	}

}
