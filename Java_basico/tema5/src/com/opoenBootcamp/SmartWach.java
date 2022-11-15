package com.opoenBootcamp;

public class SmartWach extends SmartDevice {
	
	
		
		public SmartWach(String marca, String color, int modelo,String colorExtencible, int duracionBateria) {
			super(marca, color, modelo);
			this.colorExtencible = colorExtencible;
			this.duracionBateria = duracionBateria;
			
		
		
			
		}
		String  colorExtencible; 
		int duracionBateria;
	}


