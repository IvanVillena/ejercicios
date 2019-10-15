import java.util.Scanner;
public class ejercicio11 {
	public static void main(String[] args) {
	
			Scanner s = new Scanner(System.in);
	
			int introduc;
			int i;
			
			System.out.print("Introduce un numero entero: ");
				introduc = s.nextInt();
				
				System.out.printf("\n%3s  %5s  %8s \n","|  NumEntero  |","  Cuadrado  |","  Cubo  |");
				
			for (i=introduc;i<introduc + 5;i++) {
				
				System.out.printf("%8s %15s %13s \n",i,i*i,i*i*i);

			}
			
		
	}
}
