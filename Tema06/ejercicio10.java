public class ejercicio10 {

	public static void main(String[] args) {
	
		int longitud;
		int caracter;
		int i;
		
		longitud = (int)(Math.random()*40)+1;
		
		System.out.println("La siguiente linea tiene una longitud de: " + longitud + " caracteres.");
		System.out.println("Caracteres: * | @ . = \n");
		
		for (i=longitud-1;i>=0;i--) {
			
			caracter = (int)(Math.random()*5);
			
			switch ( caracter ) {
				
				case 0:
				System.out.print("*");
				break;
				case 1:
				System.out.print("|");
				break;
				case 2:
				System.out.print("@");
				break;
				case 3:
				System.out.print(".");
				break;
				case 4:
				System.out.print("=");
				break;
				
				default:
			}
			
		}
		
	}

}
