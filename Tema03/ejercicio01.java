import java.util.Scanner;
public class ejercicio01 {
    public static void main(String[] args) {
        System.out.println("- - - M U L T I P L I C A C I Ó N - - -");
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = s.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = s.nextInt();
        int resultado = num1*num2;
        System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es: " + resultado);
        
    }
}