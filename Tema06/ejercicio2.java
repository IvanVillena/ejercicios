public class ejercicio2 {

	public static void main(String[] args) {
	
	System.out.println("- - - B A R A J A  F R A N C E S A - - -\n");
		int carta;
		int numero;
		
		carta = (int)(Math.random()*4);
		
		numero = (int)(Math.random()*13);

				switch (numero) {
			
			case 0:
				System.out.print("\nHas sacado un 2 de ");
				break;
			case 1:
				System.out.print("\nHas sacado un 3 de ");
				break;
			case 2:
				System.out.print("\nHas sacado un 4 de ");
				break;
			case 3:
				System.out.print("\nHas sacado un 5 de ");
				break;
			case 4:
				System.out.print("\nHas sacado un 6 de ");
				break;
			case 5:
				System.out.print("\nHas sacado un 7 de ");
				break;
			case 6:
				System.out.print("\nHas sacado un 8 de ");
				break;
			case 7:
				System.out.print("\nHas sacado un 9 de ");
				break;
			case 8:
				System.out.print("\nHas sacado un 10 de ");
				break;
			case 9:
				System.out.print("\nHas sacado J de ");
				break;
			case 10:
				System.out.print("\nHas sacado Q de ");
				break;
			case 11:
				System.out.print("\nHas sacado K de ");
				break;
			case 12:
				System.out.print("\nHas sacado A de ");
				break;	
				
		}
	
		switch (carta) {
			
			case 0: 
				System.out.print("picas");
				break;
			case 1:
				System.out.print("corazones");
				break;
			case 2:
				System.out.print("diamantes");
				break;
			case 3:
				System.out.print("treboles");	
				break;		
		}
		
	
	}

}
