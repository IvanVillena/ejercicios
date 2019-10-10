import java.util.Scanner;
public class ejercicio10 {
	public static void main(String[] args) {
		System.out.println("- - - M E D I A - - -");
		
			Scanner s = new Scanner(System.in);
		
		double num;
		double sumatotal;
				sumatotal=0;
		double media;
		int numintroducidos;
			numintroducidos=0;
		
		System.out.println("\nIntroduce un número positivo(para SALIR introduce un número negativo): ");
			num = s.nextDouble();
		
		while ( num >= 0 ) {
			
			sumatotal = sumatotal + num;

			System.out.print("\nIntroduce otro número: ");
			num = s.nextDouble();
			
			if ( num > 0 ) {
					numintroducidos++;
				} else {
					System.out.println("\nHas salido correctamente");
				}
		}
		media = sumatotal/numintroducidos;
		System.out.println("La media de la suma de todos los números introducidos es: " + media);

	}
}
