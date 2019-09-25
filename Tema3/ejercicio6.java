import java.util.Scanner;
public class ejercicio6{
    public static void main(String[] args) {
        System.out.println("- - - T R I A N G U L O - - -");
        Scanner tri = new Scanner(System.in);
        System.out.println("Introduce la base del triangulo: ");
        double base = tri.nextDouble();
        System.out.println("Introduce la altura del triangulo: ");
        double altura = tri.nextDouble();
        double resultado = (base*altura)/2;
        System.out.println("El área del triangulo es: " + resultado);
    }
}