
public class Main {

	public static void main(String[] args) {
		
		// Usando un if, crear una condición que compare si la variable numerolf es positivo, negativo,
		// o 0. Pista: Los números inferiores a 0 son negativos y los supriores, positivos. 
		
		
		int numerolf = 9; 
		
		if (numerolf > 0 || numerolf <  0 || numerolf == 0) {
			System.out.println(numerolf + " " +"Es un número real"); 
		} else {
			System.out.println("No es un número real");
		}
		
		
		
		
		/*-------------------------------------------------------------------------------*/ 
		
		/**  Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea
		 *  inferior a 3, el bloque de código que tendrá el bucle deberá:

          ****Incrementar el valor de la variable en uno cada vez que se ejecute.

          ****Mostrarlo por pantalla cada vez que se ejecute.*/
		
		
		int numeroWhile = 0;
		
		while(numeroWhile  <= 3) {
			System.out.println("ineteraccion" + " " + numeroWhile ++);
			
		}
		
		
	/**------------------------------------------------------------------------------------**/	
		
		/**Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo 
		 * se debe ejecutar una vez.**/
		
		
		do {
			System.out.println("Interaciones"+ " " +numeroWhile ++);
			
			} 
		while (numeroWhile <= 3);
		
		
		/**---------------------------------------------------------------------------------------**/
		
		/**Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
		 *  que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada
		 * vez que se ejecute y deberá mostrarse por pantalla.**/
		
		
		for (int numeroFor = 0; numeroFor <= 3; numeroFor ++) {
			System.out.println("Interaccion en for: " + numeroFor);
		}
		
		
		/**--------------------------------------------------------------------------------------------**/
		
		// Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro 
		// estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por 
	     // consola informando de la estación en la que está. T
		
		
		String estacion = "Invierno";
		
		switch (estacion) {
			case "Primavera":
				System.out.println("Estamos en Primavera");
				break; 
			case "Verano":
				System.out.println("Estamos en Verano");
				break;
			case "Otoño":
				System.out.println("Estamos en Otoño");
				break;
			case "Invierno":
				System.out.println("Estamos en invierno");
				break;
			default:
				System.out.println("Ocurrio un error");
		}
		
		
		

	}

}
