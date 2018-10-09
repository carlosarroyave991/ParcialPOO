package Banco;

import java.util.Scanner;
import Banco.Ahorros;
import Banco.Cheques;


class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num=0;
		int op;
		Ahorros a = new Ahorros();
		Cheques c =new Cheques();
		do {
			System.out.println("		BIEMVENIDO AL MENU DEL CINEMA.  ");
			System.out.println("1.) Cuentas de ahorro.");
			System.out.println("2.) Cuentas de cheques.");
			System.out.println("3.) Salir del programa.");
			System.out.println("Escoja una opcion:");
			op=sc.nextInt();
			switch(op) {
			case 1:
				do {
				System.out.flush();
				System.out.println(" USTED DECIDIO INGRESAR A LAS OPCIONES DE AHORROS.");
				System.out.println("1.) Consultar usuarios.");
				System.out.println("2.) Crear usuarios.");
				System.out.println("3.) Depositar.");
				System.out.println("4.) Retiros.");
				System.out.println("5.) Regresar a menu anterior.");
				System.out.println("Escoja opcion:");
				op=sc.nextInt();
				switch(op) {
				case 1:
					System.out.flush();
					a.ConsultarAhorros();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 2:
					System.out.flush();
					a.CrearUsuario();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 3:
					System.out.flush();
					a.DepositarAhorros();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 4:
					System.out.flush();
					a.RetirarAhorros();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 5:
					//do {
					System.out.println("Usted decidio regresar al menu de inicio.");
					System.out.print("");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
					break;
				default:
					System.out.println("Esa opcion no esta en el rango especificado.");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
					break;
				}
				}while(op!=5);
				break;
			case 2:
				do {
					System.out.flush();
					System.out.println(" USTED DECIDIO INGRESAR A LAS OPCIONES DE CHEQUES.");
					System.out.println("1.) Consultar usuarios.");
					System.out.println("2.) Crear usuarios.");
					System.out.println("3.) Depositar.");
					System.out.println("4.) Retiros.");
					System.out.println("5.) Regresar a menu anterior.");
					System.out.println("Escoja opcion:");
					op=sc.nextInt();
					switch(op) {
					case 1:
						System.out.flush();
						c.ConsultarCheques();
						new java.util.Scanner(System.in).nextLine();
						break;
					case 2:
						System.out.flush();
						c.CrearUsuario();
						new java.util.Scanner(System.in).nextLine();
						break;
					case 3:
						System.out.flush();
						c.DepositarCheques();
						new java.util.Scanner(System.in).nextLine();
						break;
					case 4:
						System.out.flush();
						c.RetirarCheques();
						new java.util.Scanner(System.in).nextLine();
						break;
					case 5:
						//do {
						System.out.println("Usted decidio regresar al menu de inicio.");
						System.out.print("");
						new java.util.Scanner(System.in).nextLine();
					System.out.flush();
						break;
					default:
						System.out.println("Esa opcion no esta en el rango especificado.");
						new java.util.Scanner(System.in).nextLine();
					System.out.flush();
						break;
					}
					}while(op!=5);
					break;
			}
		}while(op!=3);
	}

}
