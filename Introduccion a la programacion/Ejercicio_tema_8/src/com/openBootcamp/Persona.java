package com.openBootcamp;

/**
 * Para practicar la encapsulación:

* Crear clase Persona.

* Crear variables las privadas edad, nombre y telefono de la clase Persona.

* Crear gets y sets de cada propiedad.

* Crear un objeto persona en el main.

* Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola
 * 
 * */



public class Persona {
	
	private static int edad; 
	private static String nombre; 
	private static int telefono; 

	
	/*---------------------------------------------------------*/
	public int getEdad(int edad) {
		 return edad;
		
	}
	
	public String getNombre(String nombre){
		return nombre;	
	}

	public int getTelefono(int telefono) {
		return telefono;
	
	}
	
	/**-----------------------------------------------------------------------------------------
	 * @return **/

	public void setEdad(int edad) {
		 this.edad = edad;
	}
	
	public void setNombre(String nombre ) {
		 this.nombre = nombre;
		
	}
	
	public void setTelefono( int telefono) {
		 this.telefono = telefono;
	}
	
	
	
	
	public static void main(String[] args ) {
	
		Persona persona = new Persona();
		
		persona.setEdad(31);
		persona.setNombre("Marco Antonio");
		persona.setTelefono(556888912);
		
		System.out.println("Nombre de pila: " + persona.getNombre(nombre));
		System.out.println("Edad: " + persona.getEdad(edad));
		System.out.println("Telefono de contacto: " + persona.getTelefono(telefono));
		
		
		
	}

}
