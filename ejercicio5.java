public class ejercicio5 {
    public static void main(String[] args) {
        double euros = 0.006d;
        double pesetas = 300d;

        double calculo = euros * pesetas;

        System.out.printf("1peseta equivale a %.3f€ y %.2fpesetas equivalen a %.2f€", euros, pesetas, calculo);
    }
}