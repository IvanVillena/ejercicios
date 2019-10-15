import java.util.Scanner;
public class ejercicio13 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		int i = 0;
		int num;
		int par = 0;
		int impar = 0;
		
		while ( i != 10 ) {
			
			System.out.print("\nIntroduce un numero: ");
				num = s.nextInt();
			if ( ( num%2 ) == 0 ) {
				
				par++;

			} else {
				
				impar++;
				
			} 
			i++;
		}
		System.out.println("Hay un total de n " + par + " numeros pares y " + impar + " numeros impares.");
	}
}
