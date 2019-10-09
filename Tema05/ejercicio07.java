import java.util.Scanner;
public class ejercicio07 {
	public static void main(String[] args) {
		
		System.out.println(" - - - C A J A  F U E R T E - - -\n");
		
		Scanner ps = new Scanner(System.in);
		
		int intentos;
		int clave;
			clave = 1234;
		int passwd;
		
			
		for (intentos=4;intentos>0;intentos--) {
			
			System.out.print("Introduce un código de 4 digitos, tienes " + intentos + " intentos: ");

				passwd = ps.nextInt();
				
			if ( passwd == clave ) {
			
				System.out.println("\nLa caja fuerte se  ha abierto satisfactoriamente.");
				intentos=0;
				} else {
					System.out.println("\n ¡ERROR - CÓDIGO INCORRECTO!");
				}
		}
		
		if ( intentos == 0 ) {
			System.out.println("Te has quedado sin intentos, vuelve a intentarlo más tarde...);
		}
		
		
	}
}
