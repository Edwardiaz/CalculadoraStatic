package com.calculadora.controlador;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
//		como las variables y metodos son static no es necesario instanciar un objeto...
//		CalculadoraDigital cd = new CalculadoraDigital();
		
		Scanner sc = new Scanner(System.in);
		boolean validar = true;
		double x = 0, y = 0;
		System.out.println("Ingrese dos NUMEROS: ");

		do {
			try {
				x = Double.parseDouble(sc.nextLine());
				y = Double.parseDouble(sc.nextLine());
				
//				CalculadoraDigital cd2 = new CalculadoraDigital(x,y);
//				System.out.println("Suma: " + cd2.sumar2());
				
				
				System.out.println("Suma: ");
				System.out.println(CalculadoraDigital.sumar(x, y));
				System.out.println("Resta: ");
				System.out.println(CalculadoraDigital.restar(x, y));
				System.out.println("Multiplicación: ");
				System.out.println(CalculadoraDigital.multiplicar(x, y));
				System.out.println("Division: ");
				System.out.println(CalculadoraDigital.division(x, y));
				validar = false;

			} catch (Exception e) {
				System.out.println("ingrese solo numeros");
				validar = true;
			}

		} while (validar == true);
	}

}
