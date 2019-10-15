import java.util.Scanner;
public class ejercicio13 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		int i = 0;
		int num;
		int negativo = 0;
		int positivo = 0;
		
		while ( i != 10 ) {
			
			System.out.print("\nIntroduce un numero: ");
				num = s.nextInt();
			if ( num >= 0) {
				
				positivo++;

			} else {
				
				negativo++;
				
			} 
			i++;
		}
		System.out.println("Hay un total de n " + positivo + " numeros positivos y " + negativo + " numeros negativos.");
	}
}
