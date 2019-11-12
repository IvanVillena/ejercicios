import java.util.Scanner;
public class ejercicio06 {

	public static void main(String[] args) {
	
		System.out.println("\n- - - ADIVINA EL NUMERO OCULTO - - -");
		
		int random;
		int i;
			i = 5;
		int num;
			num = -110;
		
		Scanner n = new Scanner(System.in);
			
			
		random = (int)(Math.random()*101);
		
		
		while ((i != 0 ) || ( random != num )) {

		System.out.println("\n^Tienes un total de " + i + " intentos^");

			System.out.print("\nIntroduce un numero: ");
			num = n.nextInt();
			
			if ( num < random ) {
				
				System.out.println("\nEl numero oculto es mayor que " + num);
				
			} else {
				
				System.out.println("\nEl numero oculto es menor que " + num);
	
			}
			
			i--;
			
		}
		
		if (i == 0) {
			
			System.out.println("Te has quedado sin intentos :( HAS PERDIDO");
			
		} else {
			
			System.out.println("¡HAS ACERTADO! FELICIDADES :) ");
		}
	
	}

}
