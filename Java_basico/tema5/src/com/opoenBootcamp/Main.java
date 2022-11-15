package com.opoenBootcamp;


public class Main {

	public static void main(String[] args) {
		
		SmartDevice smartDevice = new SmartDevice("Sansung", "negro", 2022);
		SmartWach smartwach = new SmartWach("Nokia", "azul",2020,"blanco",23);
		SmartPhone smartPhone = new SmartPhone("Vika","morado",2019,"mitzu","Telcel");
		
		
		
		
	
		
		
		
		System.out.println("marca: " +smartDevice.marca + " color: " + smartDevice.color + " modelo: "+smartDevice.modelo);
		System.out.println("marca: " +smartwach.marca + " color: " + smartwach.color + " modelo: "+smartwach.modelo+ " Extencible: "+ smartwach.colorExtencible+ " Duracion Bateria: "+smartwach.duracionBateria);
		System.out.println("marca: " +smartPhone.marca + " color: " + smartPhone.color + " modelo: "+smartPhone.modelo+ " Bocina: "+ smartPhone.bocina+ " Comapañia: "+smartPhone.companiaTelfonica);
		
		
	}
	
	
}
