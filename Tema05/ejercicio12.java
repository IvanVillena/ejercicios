import java.util.Scanner;
public class ejercicio12 {
	public static void main(String[] args) {
		System.out.println(" - - - F I B O N A C C I - - - ");
		Scanner s = new Scanner(System.in);
		int num;
		int i;
		int fib1;
				fib1=-1;
		int fib2;
				fib2=1;
		int fib3;
		

		System.out.print("\n\n ¿Cuantos numeros de la serie Fibonacci quieres ver?: ");
			num = s.nextInt();
			
			
			
			for ( i=num;i>0;i-- ) {
				
				fib3=fib1+fib2;
				System.out.print(" " + (-(fib3)));
				
				fib2=fib1;
				fib1=fib3;
				
			}
		
		
	}
}
