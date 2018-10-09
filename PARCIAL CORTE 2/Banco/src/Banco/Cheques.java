package Banco;

import java.util.Scanner;

public class Cheques {
	
	private Scanner sc;
	int[] num_cheques = new int[150];
	String[] nombre_cheques= new String[150];
	int[] saldo_cheques= new int[150];
	int deposito,retiro,interes;
	String[] fecha_vencimiento=new String[150];
	int a;
	int b,cont;

	/*public Ahorros(){
		
		num_ahorros[0]="";
		nombre_ahorros[0]="";
		saldo_ahorros[0]="";
		fecha_vencimiento[0]="";
		deposito=0;
		retiro=0;
		interes=0;
		a=0;
		b=0;
		cont=0;
	}
	*/
	public void CrearUsuario() {
		sc =new Scanner(System.in);
		System.out.println("Usted decidio Crear un usuario nuevo.");
		System.out.println("Ingrese el numero de usuarios que desea crear:");
		if(a>0) {
			b=sc.nextInt();
			cont=a+b;
			for(int i=a+1;i<=cont;i++) {
				sc.nextLine();
				System.out.println(i+".) Ingrese el nombre del usuario: ");
				nombre_cheques[i]=sc.nextLine();
				System.out.println(i+".) Ingrese el numero de la cuenta: ");
				num_cheques[i]=sc.nextInt();
				System.out.println(i+".) Ingrese el saldo: ");
				saldo_cheques[i]=sc.nextInt();
				sc.nextLine();
				System.out.println(i+".) Ingrese la fecha de vencimiento de la cuenta:");
				fecha_vencimiento[i]=sc.nextLine();
				System.out.println("");
			}
		}else {
			a=sc.nextInt();
			for(int i=1;i<=a;i++) {
				sc.nextLine();
				System.out.println(i+".) Ingrese el nombre del usuario: ");
				nombre_cheques[i]=sc.nextLine();
				System.out.println(i+".) Ingrese el numero de la cuenta: ");
				num_cheques[i]=sc.nextInt();
				System.out.println(i+".) Ingrese el saldo: ");
				saldo_cheques[i]=sc.nextInt();
				System.out.println(i+".) Ingrese la fecha de vencimiento de la cuenta:");
				fecha_vencimiento[i]=sc.nextLine();
				System.out.println("");
			}
		}
		System.out.println("Los usuarios se han creado con exito.");
		
	}
	
	public void ConsultarCheques() {
		sc =new Scanner(System.in);
		System.out.println("Usted decidio listar los usuarios ingresados.");
		for(int i=1;i<=a;i++) {
			System.out.println(i+".)El nombre del usuario es: "+this.nombre_cheques[i]);
			System.out.println(i+".)El numero de la cuenta es: "+this.num_cheques[i]);
			System.out.println(i+".)Saldo del cliente es: "+this.saldo_cheques[i]);
			System.out.println(i+".)La fecha de vencimiento de la cuenta es: "+this.fecha_vencimiento[i]);
			System.out.println(" ");
		}
		System.out.println("Los datos de usuario se han mostrado correctamente.");
	}
	
	public void DepositarCheques() {
		sc =new Scanner(System.in);
		
		System.out.println("Usted decidio depositar dinero a la cuenta de cheques.");
		System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para depositar a esa cuenta.");
		for(int i=1;i<=a;i++) {
			System.out.println(i+".)El nombre del usuario es: "+this.nombre_cheques[i]);
			System.out.println(i+".)El numero de la cuenta es: "+this.num_cheques[i]);
			System.out.println(i+".)Saldo del cliente es: "+this.saldo_cheques[i]);
			System.out.println(i+".)La fecha de vencimiento de la cuenta es: "+this.fecha_vencimiento[i]);
			System.out.println(" ");
		}
		System.out.println("Ingrese numero:");
		int i=sc.nextInt();
		sc.nextLine();
		System.out.println(i+".) Ingrese el saldo que desea depositar: ");
		deposito=sc.nextInt();
		saldo_cheques[i]+=deposito;
		System.out.println("");
		System.out.println("Los datos han sido guardados correctamente.");
	
	}
	
	public void RetirarCheques() {
sc =new Scanner(System.in);
		
		System.out.println("Usted decidio depositar dinero a la cuenta de cheques.");
		System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para retirar a esa cuenta.");
		for(int i=1;i<=a;i++) {
			System.out.println(i+".)El nombre del usuario es: "+this.nombre_cheques[i]);
			System.out.println(i+".)El numero de la cuenta es: "+this.num_cheques[i]);
			System.out.println(i+".)Saldo del cliente es: "+this.saldo_cheques[i]);
			System.out.println(i+".)La fecha de vencimiento de la cuenta es: "+this.fecha_vencimiento[i]);
			System.out.println(" ");
		}
		System.out.println("Ingrese numero:");
		int i=sc.nextInt();
		sc.nextLine();
		System.out.println(i+".) Ingrese el saldo que desea retirar: ");
		retiro=sc.nextInt();
		saldo_cheques[i]-=retiro;
		System.out.println("");
		System.out.println("Los datos han sido guardados correctamente.");
	
	}
}
