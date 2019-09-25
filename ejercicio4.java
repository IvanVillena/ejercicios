public class ejercicio4 {
    public static void main(String[] args) {
        double euros = 30.50d;
        double pesetas = 166.386d;

        double calculo = euros * pesetas;

        System.out.printf("1€ equivale a %.2f pesetas y %.2f€ equivale a %.2f pesetas", pesetas, euros, calculo);
    }
}