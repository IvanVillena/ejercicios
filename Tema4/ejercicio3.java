public class ejercicio3 {
    public static void main(String[] args) {
        int dia;
        System.out.print("\n Introduce un número (1-7): ");
        dia = Integer.parseInt(System.console().readLine());

        if ( ( dia<= 0 ) || ( dia>7 ) ) {
            System.out.println("\n Debes introducir un número entre el 1 y el 7");
        } else {
            switch (dia) {
                case 1:
                System.out.println("\n Lunes");
                break;
                case 2:
                System.out.println("\n Martes");
                break;
                case 3:
                System.out.println("\n Miercoles");
                break;
                case 4:
                System.out.println("\n Jueves");
                break;
                case 5:
                System.out.println("\n Viernes");
                break;
                case 6:
                System.out.println("\n Sabado");
                break;
                case 7:
                System.out.println("\n Domingo");
            }
        }
    }
}