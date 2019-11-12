public class ejercicio03 {

	public static void main(String[] args) {
	
	System.out.println("- - - B A R A J A  F R A N C E S A - - -\n");
		int carta;
		int numero;
		
		carta = (int)(Math.random()*4);
		
		numero = (int)(Math.random()*10);

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
				System.out.print("\nHas sacado sota de ");
				break;
			case 7:
				System.out.print("\nHas sacado caballo de ");
				break;
			case 8:
				System.out.print("\nHas sacado rey de ");
				break;
			case 9:
				System.out.print("\nHas sacado as de ");
				break;	
				
		}
	
		switch (carta) {
			
			case 0: 
				System.out.print("espadas");
				break;
			case 1:
				System.out.print("bastos");
				break;
			case 2:
				System.out.print("monedas");
				break;
			case 3:
				System.out.print("copas");	
				break;		
		}
		
	
	}

}
