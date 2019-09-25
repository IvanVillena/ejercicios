import java.util.Scanner;
public class ejercicio2{
    public static void main(String[] args) {
        System.out.println("- - - C O N V E R S O R - - -");
        System.out.println(" 1€ = 166.386 pesetas");
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros(€) que quieres pasar a pesetas");
        double euros= s.nextDouble();
        double resultado = euros*166.386;
        System.out.printf("%.2f€ son %.2f pesetas",euros, resultado);
    }
}