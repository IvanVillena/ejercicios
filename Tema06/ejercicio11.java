public class ejercicio11 {

	public static void main(String[] args) {
	
	
		int nota;
		int i;
		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		
		for (i=20;i>=0;i--) {
			
			nota = (int)(Math.random()*11);
			
			if ( nota < 5 ) {
				suspenso++;
				
				System.out.println(nota + " Suspenso");
				
			} else if ( (nota >= 5) && ( nota < 6) ) {
				suficiente++;
				
				System.out.println(nota + " Suficiente");
				
			} else if ( (nota >= 6) && (nota < 7) ) {
				bien++;
				
				System.out.println(nota + " Bien");
				
			} else if ( (nota >=7) && ( nota < 9) ) {
				notable++;
				
				System.out.println(nota + " Notable");
				
			} else if ( nota >= 9 ) {
				sobresaliente++;
				
				System.out.println(nota + " Sobresaliente");
				
			}
			
		}
		
		System.out.println("\n Has sacado un total de: " + suspenso + " suspensos, " + suficiente + " suficientes, " + bien + " bienes, " + notable + " notables y " + sobresaliente + " sobresalientes.");

	}

}
