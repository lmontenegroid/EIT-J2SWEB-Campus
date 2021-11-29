package clase1;

import java.util.Scanner;

public class Ej3 {
	
	public static void main(String[] args) {
	
		//1) Realice un programa que genere un número aleatorio entre 1 y 10 y le pida
		// al usuario que adivine el número
		
		
		/* BORRAR
		int nAlea = (int) Math.floor(Math.random()*10 + 1);
		int eleccion;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Adivine el valor entre 1 y 10");
		eleccion = teclado.nextInt();
		
		while(nAlea != eleccion) {
			System.out.println("Incorrecto, intente de vuelta");
			System.out.println("Adivine el valor entre 1 y 10");
			eleccion = teclado.nextInt();
		}
		System.out.println("Correcto, el número era " +nAlea);
		
		teclado.close();
		
		BORRAR */
		
		//1) Realice un programa que genere un número aleatorio entre 1 y 10 y le pida
		// al usuario que adivine el número, tiene 3 intentos si no user bloqueado
		
		
		int nAlea = (int) Math.floor(Math.random()*10 + 1);
		int eleccion, intentos = 3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Usted tiene " +intentos+ " intentos\n");
		
		System.out.println("Adivine el valor entre 1 y 10");
		eleccion = teclado.nextInt();
		
		while(nAlea != eleccion && intentos>1) {
			intentos--;
			System.out.println("Incorrecto, intente de vuelta");
			System.out.println("Usted tiene " +intentos+ " intentos\n");
			
			System.out.println("Adivine el valor entre 1 y 10");
			eleccion = teclado.nextInt();
		}
		
		if (intentos>1)
			System.out.println("Correcto, el número era " +nAlea);
		else
			System.out.println("Usted ha ingresado el límite de veces erroneamente, bloqueado.");
		
		teclado.close();
	}
	
}
