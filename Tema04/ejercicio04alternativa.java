public class ejercicio04alternativa {
    public static void main(String[] args) {
        int horas;
        int horasNormales;
        int horasExtra;
        int resultado;
        System.out.print("¿Cuantas horas has trabajado esta semana?: ");
        horas = Integer.parseInt(System.console().readLine());
		
		horasNormales = (horas<=40)? horas : 40;
		horasExtra = (horas<=40)? 0 horas-40;
		resultado = (horasNormales*12+horasExtra*16);
        System.out.println("\n Esta semana has trabajado " + horas + " horas, y has ganado " + resultado + "€" );

    }
}
