
public class Trabajador extends Persona {
	private static int salario;
	
	

	public static void main(String[] args) {
	
		Trabajador trabajador = new Trabajador();
		trabajador.edad = 31; 
		trabajador.nombre = "Antonio";
		trabajador.telefono = 558977982;
		salario = 30000;
		
		System.out.println("Nombre: " + trabajador.nombre);
		System.out.println("Edad: " + trabajador.edad);
		System.out.println("Telefono de contacto: " + trabajador.telefono);
		System.out.println("Credito disponible: " + salario);


	}

}
