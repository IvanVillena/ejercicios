import java.util.Scanner;
public class ejercicio09 {
	public static void main(String[] args) {
		int num;
		int digitos;
			digitos = 0;
		int numentero;
		
		Scanner s = new Scanner(System.in);
			
		System.out.print("\nIntroduce un número: ");
		num = s.nextInt();
			numentero = num;
		
		while ( num !=0 ) {
			
			num = num/10;
			
			digitos++;
			
		}
			System.out.println("\nEl número " + numentero + " tiene " + digitos + " digitos.");
	
	}
}
