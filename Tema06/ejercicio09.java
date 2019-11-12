public class ejercicio09 {
	public static void main(String[] args) {
	
		int random;
			random = 0;
		int cuenta;
			cuenta = 0;
			
			do {
				
				random = (int)(Math.random()*101);
				
				if ( ( random % 2 ) == 0 ) {
					
					System.out.println(random);
					cuenta++;
				}
				
			} while (random != 24 );
		
			System.out.println("Se han generado " + cuenta + " numeros aleatorios pares");
	}

}
