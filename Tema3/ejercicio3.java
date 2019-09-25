import java.util.Scanner;
public class ejercicio3{
    public static void main(String[] args) {
        System.out.println("- - - C O N V E R S O R - - -");
        System.out.println("1 peseta = 0.006€");
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la cantidad de pesetas que quieres pasar a euros(€): ");
        double pesetas = s.nextDouble();
        double resultado= pesetas*0.006;
        System.out.printf("%.2f pesetas equivalen a %.2f€",pesetas,resultado);
    }
}