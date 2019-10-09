public class dospares {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        
        System.out.print("\n Introduzca el primer número entero: ");
            valor1 = Integer.parseInt(System.console().readLine());
        System.out.print("\n Introduzca otro número entero: ");
            valor2 = Integer.parseInt(System.console().readLine());
        if (( (valor1%2) == 0) && ( (valor2%2) == 0 )) {
            System.out.println("\n Los números " + valor1 + " y " + valor2 + " son PARES");
        } else {
            System.out.println("\n Los dos números " + valor1 + " y " + valor2 + " NO son PARES");
        }
    }
}