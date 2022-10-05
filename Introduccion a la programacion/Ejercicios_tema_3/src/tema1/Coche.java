package tema1;

public class Coche {
	 static int puertas = 4;
	 int modelo;
	 int totalPuertas = incrementoPueras();
	 String nombreCoche;
	 
	 public int  incrementoPueras() {
		 return puertas = ++puertas;
		 
	 }
	 
	 
	 public Coche(int puertas, int modelo, String nombreCoche) {
		 
		 System.out.println("El nombre del cohe es: "+ nombreCoche);
		 System.out.println("El modelo de carro es: "+ modelo);
		 System.out.println("El número de puertas que tiene el carro es: "+ totalPuertas );
	 }
	 
	 
	
	
	
	
	 public static void main(String[] args) {
		
		 Coche coche = new Coche(puertas,1945,"Bocho");
		 
	 }
	
	} 


