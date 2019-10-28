import java.util.Scanner;
public class ejercicioExtra {

	public static void main(String[] args) {

		System.out.println("\nPARES O NONES");
		
		int pon;
		int num;
		int maq;
		int suma;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n¿Pares(1) o Nones(2)? ");
			pon = s.nextInt();
			
		System.out.println("\nIntroduce un numero del 0 al 10");
			num = s.nextInt();
		
		
		maq = (int)(Math.random()*11);
		
		suma = maq + num;
		
		if ( ( pon == 1 ) && ( suma%2 == 0 ) ) {
			
			System.out.println(" la suma entre la maquina (" + maq + ") y tu numero (" + num + ") es " + suma +" por lo tanto HAS GANADO");
			
		} else if ( ( pon == 1 ) && ( suma%2 != 0 ) )  {
			System.out.println(" la suma entre la maquina (" + maq + ") y tu numero (" + num + ") es " + suma +" por lo tanto HAS PERDIDO");
		} else if ( ( pon == 2 ) && ( suma%2 != 0 ) ) {
			
			System.out.println(" la suma entre la maquina (" + maq + ") y tu numero (" + num + ") es " + suma + " por lo tanto HAS GANADO");
			
		} else {
			System.out.println(" la suma entre la maquina (" + maq + ") y tu numero (" + num + ") es " + suma + " por lo tanto HAS PERDIDO");
		}
		
	
	}

}
