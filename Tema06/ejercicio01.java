public class ejercicio01 {

	public static void main(String[] args) {

		System.out.println("Vamos a tirar 3 dados: \n");
		
		int i;
		int dado;
		
		for (i=1;i<=3;i++) {
			dado = (int)(Math.random()*6)+1;
			
			System.out.println("El dado " + i + " ha sacado " + dado);
		}
	
	}

}
