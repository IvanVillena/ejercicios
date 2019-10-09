public class pareimpar {
    public static void main(String[] args) {
        int valorRecogido;
        System.out.print("Introduce un número entero: ");
        valorRecogido = Integer.parseInt(System.console().readLine());

        if ((valorRecogido % 2) == 0) {
            System.out.println("El número " + valorRecogido + " es PAR");
         } else {
                System.out.println("El número " + valorRecogido + " es IMPAR");
        }   
    }
}