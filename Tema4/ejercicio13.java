import java.util.Scanner;
public class ejercicio13 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int primero;
		int segundo;
		int tercero;
		
		System.out.print("Introduce un número: ");
			num1 = s.nextInt();
		
		System.out.print("\nIntroduce un número: ");
			num2 = s.nextInt();
		
		System.out.print("\nIntroduce un número: ");
			num3 = s.nextInt();
		
		if ( ( num1>num2 ) && ( num1>num3) ) {
			primero = num1;
			if (num2>num3) {
				segundo = num2;
				tercero = num3;
			} else {
				segundo = num3;
				tercero = num2;
			}
		} else if ( ( num2>num1 ) && ( num2>num3) ) {
				primero = num2;
			if (num1>num3) {
				segundo = num1;
				tercero = num3;
			} else {
				segundo = num3;
				tercero = num1;
			}
			} else {
				primero = num3;
			if ( num1>num2) {
				segundo = num1;
				tercero = num2;
			} else {
				segundo = num2;
				tercero = num1;
			}
		}
		System.out.println("\n Orden de mayor a menor: " + primero + " " + segundo + " " + tercero);
	}
}
