import java.util.Scanner;
public class ejercicio05{
    public static void main(String[] args) {
        System.out.println("- - - R E C T A N G U L O - - -");
        Scanner rec = new Scanner(System.in);
        System.out.println("Introduce la base del rectangulo: ");
        double base = rec.nextDouble();
        System.out.println("Introduce la altura del rectangulo: ");
        double altura = rec.nextDouble();
        
        double resultado = base * altura;
        System.out.println("El área del rectangulo es: " + resultado);
}
}