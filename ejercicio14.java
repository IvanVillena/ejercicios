import java.lang.Math;
import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		
		int num;
		int exp;
		int total = 1;
		int i;
		
			Scanner s = new Scanner(System.in);
			
			System.out.print("\n Introduce un numero entero positivo: ");
				num = s.nextInt();
			System.out.print("\n Introduce su exponente: ");
				exp = s.nextInt();
			if ( num<0 ) {
				System.out.println("Numero no valido");
			} else if ( exp == 0 ) {
				
				System.out.println("El total es: 1");	
				
			} else {
				for ( i=exp;i>0;i-- ) {
					
					total *= num;
					
				}
				
			}
			
			System.out.println("El " + num + " elevado a " + exp + " es " + total);
	}
}
