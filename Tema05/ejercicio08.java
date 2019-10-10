import java.util.Scanner;
public class ejercicio08 {
	public static void main(String[] args) {
		
		int num;
		int i;
		int multiplicacion;

		Scanner multi = new Scanner(System.in);
		
		System.out.println("- - - T A B L A  M U L T I P L I C A C I O N - - -");
		System.out.print("\nIntroduce un número: ");
			num = multi.nextInt();
			
		for (i=0;i<=10;i++) {
			
			multiplicacion=num*i;
			
			System.out.println("\n"+ num + " x " + i + " = " + multiplicacion);
			
		}
	}
}
