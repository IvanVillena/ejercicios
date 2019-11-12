public class ejercicio05 {

	public static void main(String[] args) {
	
		System.out.println("\n- - - 50 NUMEROS ENTEROS ALEATORIOS ENTRE 100 y 199 - - -\n");
		
		int i;
		int random;
		int num;
		int max;
			max = 0;
		int min;
			min = 9999;
		int suma;
			suma = 0;
		int media;
		
		for (i=0;i<=50;i++) {
			
			random = (int)(Math.random()*199-100+1)+100;
			
			if ( random > max ) {
				
				max = random;
				
			}
			
			if ( random < min ) {
				
				min = random;
				
			}
			
			
			suma= suma + random;
			
			System.out.print(random + " ");
		
			
		}
		media = suma/50;
		System.out.println("\n\nEl numero mas grande es " + max + "\nEl mas pequeño es " + min + "\nLa media de todos los numeros es " + media);
	
	}

}
