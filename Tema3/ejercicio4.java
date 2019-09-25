import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("- - - O P E R A C I O N E S - - -");
        System.out.println("\nIntroduce un número: \n");
        Scanner a = new Scanner(System.in);
        double num1 = a.nextDouble();
        System.out.println("\nIntroduce otro número: \n");
        double num2= a.nextDouble();
        double suma=num1+num2;
        double resta=num1-num2;
        double division=num1/num2;
        double multiplicacion=num1*num2;
        
        System.out.println("\nLa suma entre " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta entre " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La división entre " + num1 + " y " + num2 + " es: " + division);
        System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es: " + multiplicacion);

    }
}