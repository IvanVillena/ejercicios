public class ejercicio1 {
    public static void main(String[] args) {
        String dia;

        System.out.print("\n Introduce un día de la semana (en minúscula): ");
        dia = System.console().readLine();

        switch (dia) {
            case "lunes":
            System.out.println("\n El Lunes tengo a primera hora Entorno de desarrollo");
            break;
            case "martes":
            System.out.println("\n El martes tengo a primera hora Programación");
            break;
            case "miercoles":
            System.out.println("\n El miercoles tengo a primera hora Programación");
            break;
            case "jueves":
            System.out.println("\n El jueves tengo a primera hora Programación");
            break;
            case "viernes":
            System.out.println("\n El viernes tengo a primera hora Formación y Orientación Laboral");

        }
    
    }
}