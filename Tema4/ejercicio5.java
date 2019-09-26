import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        double b;
        double resultado;
        System.out.println("- - - E C U A C I Ó N - 1º - G R A D O - - -");
        System.out.print("\n Introduce el valor de 'a': ");
        a = s.nextDouble();
        System.out.print("\n Introduce el valor de 'b': ");
        b = s.nextDouble();
        System.out.println(a + "x+" + b + "=0");
        if ( a == 0) {
            System.out.println("\n Esta ecuación no tiene solución");
            
        } else {
            resultado = -b/a;
            System.out.println("\n x=" + resultado);
        }
    }
}