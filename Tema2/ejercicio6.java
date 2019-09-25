public class ejercicio6 {
    public static void main(String[] args) {
        double eurnoiva = 10;
        double iva = 21;
        double resultado = (eurnoiva * iva / 100)+ eurnoiva;

        System.out.printf("Un producto cuesta %.2f sin iva, si se lo aplicamos este nos costará %.2f" , eurnoiva, resultado);
    }
}