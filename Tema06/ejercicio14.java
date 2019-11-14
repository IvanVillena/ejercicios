import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
	
		int num;
		Scanner s = new Scanner(System.in);
		int adv;
		int intentos = 5;
		String pista;
		int mayor = 0;
		int menor = 100;
		
		System.out.println(" - - - A D I V I N A  E L  N U M E R O - - - ");
		
		System.out.print("\n Introduce un numero y la maquina intentará adivinarlo : ");
		num = s.nextInt();
		
		do {
			
			
			
		} while ( !(( num>=0 ) && ( num<=100) ));
		
		adv = (int)(Math.random()*101);
		System.out.println(adv);
		
		do {
			intentos--;
			
			System.out.println("¿El numero oculto es mayor o menor?");
			pista = System.console().readLine();
			
			switch (pista) {
				
				case "mayor":
				
				System.out.println("El numero oculto es mayor al introducido");
				mayor = adv;
				break;
				
				case "menor":
				
				System.out.println("El numero oculto es menor al introducido");
				
				menor = adv-mayor;
				break;
				
				default:
			}
		adv = (int)(Math.random()*menor+1)+mayor;
		System.out.println(adv);

		} while ( ( adv != num ) && (intentos != 0) );
		
		if ( adv == num ) {
			
			System.out.println("¡HAS ACERTADO!");
			
		} else {
			
			System.out.println("¡HAS PERDIDO!");
			
		}
	
	}

}
