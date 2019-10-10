import java.util.Scanner;
public class ejercicio08 {
	public static void main(String[] args) {
		double horas;
		double salario;
		int descanso;
		int dias;
			dias = 7;
		Scanner s = new Scanner(System.in);
		
		System.out.print("¿Cuántos días de descanso tienes a la semana? ");
		descanso = s.nextInt();
			dias = dias - descanso;
		
		System.out.print("\n¿Cuántos horas trabajas al día? ");
		horas = s.nextDouble();
		
		salario = (horas*dias)*12;
		
		System.out.println("\nA la semana ganas: " + salario);
		
		
		
	}
}
