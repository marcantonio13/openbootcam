package com.openBootcamp;

import java.util.Scanner;

public class IVA {

	public static void main(String[] args) {

		System.out.println("Dame un valor del producto");
		Scanner scanner = new Scanner(System.in);
		double precio = scanner.nextInt();
		double precioIVA = getPrecio(precio);
		System.out.println("El preio con IVA es: "+precioIVA);
	
		
		
	}
	
	private static double getPrecio(double precio) {
		return precio*1.16;
		
	}

}
