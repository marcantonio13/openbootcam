package tema7_8_9;

import java.util. *;

public class ejercicio7_8_9 {

private static final int LinkedList = 0;
private static final int String = 0;

/*
 * Dada la función:

 public static String reverse(String texto) { }

Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", 
debe retornar "odnum aloh".
 * 
 * **/	
	
	
	
	
	public static void main(String[] args) {
	

		 String hola = "Hola mundo";
		
		StringBuilder builder = new StringBuilder(hola);
		
			String holaAlReves = builder.reverse().toString();
			System.out.println(holaAlReves);
			
			
			
			/*-----------------------------------------------------------------------------*/
			
		// Crea un array bidimensional de enteros y recórrelo, mostrando la posición y 
			// el valor de cada elemento en ambas dimensiones.
		
			int[][] matriz = {
					
					{1,2,3},
					{4,5,6}
			};
			
			
			for(int i = 0; i < matriz.length; i++) {
				
					for(int j = 0; j  < matriz[i].length; j ++) {
						
						System.out.println("Columna "+i+" renglon " + j+ " = " +matriz[i][j] );
						
						
					}
				
			}
			
			
			//3.-  Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
			//Elimina el 2o y 3er elemento y muestra el resultado final.
			
			Vector 	vector = new Vector(4);
			
			vector.add(1);
			vector.add(2);
			vector.add(3);
			vector.add(4);
			vector.add(5);
			
			
			System.out.println(vector);
			
			vector.remove(1);
			vector.remove(0);
		
			
			System.out.println(vector);
			
			
			//  4.- Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 
			// elementos para ser añadidos al mismo.
			
			// Que por defecto da 10 espacios y necetas especificar la capacidad  y la capacidad de incremento 
			
			
			// 5.- Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
			//Recorre ambos mostrando únicamente el valor de cada elemento.
			
			
			  ArrayList<String> list = new ArrayList<String>();
			
			list.add("Marco");
			list.add("Antonio");
			list.add("Luis");
			list.add("Karen");
			
			
			
			LinkedList<String> list2 = new LinkedList<String>(list);
			
			for(String nombres: list) {
				
				System.out.println("Elementos de arrayList: "+nombres);
				
			}
			
			
			for(int i = 0; i < list2.size(); i++) {
				
				System.out.println("Elementos de LinkedList: "+ list2.get(i));
			}
			
			//Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle,
			//recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. 
			//Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.	
			
			ArrayList<Integer> enteros = new  ArrayList<Integer>();
			
		 for(int i = 0; i <= 10; i++) {
			 
			  enteros.add(i);
			  
			 
			  	
		 }	
		 
		  for(int j = 0; j < enteros.size();j++) {
			  
			  if(j%2!= 0) {
				  
				  enteros.remove(j);
			  }
		  }
		 
		  System.out.println(enteros);
		 
		 
			  			
			  			
			  			
			  		
			  		
			  		
			  	
			 
			 
			 
			 
		 
			
			
			
			
			
			
			
			
	}

	
	

}
