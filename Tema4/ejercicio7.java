import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;
        System.out.print("Introduce la 1º nota: ");
        nota1 = s.nextDouble();
        System.out.print("\nIntroduce la 2º nota: ");
        nota2 = s.nextDouble();
        System.out.print("\nIntroduce la 3º nota: ");
        nota3 = s.nextDouble();
        media = (nota1+nota2+nota3)/3;
        System.out.println("La media entre las notas: " + nota1 + " " + nota2 + " y "+ nota3 + " es: " + media);


    }
}