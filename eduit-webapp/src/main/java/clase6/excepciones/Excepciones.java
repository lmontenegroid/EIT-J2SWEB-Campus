package clase6.excepciones;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import clase6.enums.TiposDocumento;

public class Excepciones {

	// Atributo de clase
	public static Scanner teclado = new Scanner(System.in);

	// Solicita al usuario una fecha y retorna el Date de la misma
	// Chequea que la fecha sea real
	public static Date obtenerFecha() {
		// Atributos
		int anio = 0, mes = 0, dia = 0;

		// Pedimos el año de la fecha, chequea un año válido

		while (anio == 0) {
			try {
				System.out.println("Ingrese el año (entre 1996 y 2021): ");

				anio = obten_int();
				if (anio != 0) {
					if (anio < 1996 || anio > 2021) {
						System.err.println("Debe ingresar un año entre 1996 y 2021 ");

					}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		// Pedimos el mes de la fecha, chequea un mes válido 
		while (mes == 0) {
		try {
			System.out.println("Ingrese el mes (entre 1 y 12): ");

			mes = obten_int();
			if (mes != 0) {
				if (mes < 1 || mes > 12) {
					System.err.println("Debe ingresar un mes entre 1 y 12 ");

				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		

	// Pedimos el día de la fecha, se chequea acorde al mes (no chequea bisiesto)
	do
	{
		try {

			System.out.println("Ingrese el dia: ");
			dia = teclado.nextInt();
			if (mes == 2) {
				while (dia > 28 || dia < 1) {
					System.err.println("el mes 2 posee un maximo de 28 dias");
					System.out.println("Ingrese el dia: ");
					dia = teclado.nextInt();
				}
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				while (dia < 1 || dia > 30) {
					System.err.println("Debe estar comprendido entre 1 y 30");
					System.out.println("Ingrese el dia: ");
					dia = teclado.nextInt();
				}
			} else
				while ((dia > 31)) {
					System.err.println("Debe estar comprendido entre 1 y 31");
					System.out.println("Ingrese el dia: ");
					dia = teclado.nextInt();
				}

		} catch (Exception e) {
			System.err.println("debe ingresar un dato valido: " + e.getMessage());
			dia = 0;
		}
	}while(dia==0);

	return new Date(anio-1900,mes-1,dia);
	}

	public static TiposDocumento documentoValido() {
		String tipoDoc = "";

		do {
			try {
				System.out.println("Tipos de documentos válidos: DNI, LE, CI, PAS ");
				System.out.println("Ingrese el tipo de documento: ");
				tipoDoc = teclado.next();
				tipoDoc = tipoDoc.toLowerCase();

				if (tipoDoc.equals("dni"))
					return TiposDocumento.DNI;
				else if (tipoDoc.equals("le"))
					return TiposDocumento.LE;
				else if (tipoDoc.equals("ci"))
					return TiposDocumento.CI;
				else if (tipoDoc.equals("pas"))
					return TiposDocumento.PAS;
			}

			catch (Exception e) {
				System.err.println("Usted tipeó cualquier cosa.");
				tipoDoc = "";
			}
		} while (!tipoDoc.equals(""));

		return TiposDocumento.DNI;

	}

	public static int obten_int() {

		String aux = "";
		if (teclado.hasNextInt()) {
			return teclado.nextInt();
		} else {
			aux = teclado.next();
			System.err.println("Tenés que teclear bien, imbecil");
			return 0;
		}
	}

}
