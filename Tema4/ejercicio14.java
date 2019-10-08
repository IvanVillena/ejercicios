import java.util.Scanner;
public class ejercicio14 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int num;
		String div5;
		String par;
		
		System.out.print("Introduce un número: ");
		num = s.nextInt();
		
		if ( num%5 == 0 ) {
		div5 = " sí ";
		} else {
		div5 = " no ";
		}
		
		if ( num%2 == 0 ) {
		par = " sí ";
		} else {
		par = " no ";
		}
		System.out.println("\nEl número " + num + div5 + "divisible entre 5 y" + par + "es par.");
	}
}
