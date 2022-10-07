
public class Cliente extends Persona {
	private static int credito; 
	
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.edad = 31; 
		cliente.nombre = "Antonio";
		cliente.telefono = 558977982;
		credito = 500000;
		
		System.out.println("Nombre: " + cliente.nombre);
		System.out.println("Edad: " + cliente.edad);
		System.out.println("Telefono de contacto: " + cliente.telefono);
		System.out.println("Credito disponible: " + credito);
		
		
	}

}
