import java.util.Scanner;
public class ejercicio07{
    public static void main(String[] args) {
        
        double totalsiniva;
        double iva;
        double totalconiva;
        double descuento;
        double totaldescuento;
        
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Introduce el precio sin IVA de una factura: ");
			totalsiniva = s.nextDouble();
			
		System.out.print("\nIntroduce el % del IVA: ");
			iva = s.nextDouble();
		
		System.out.print("\nIntroduce el % de descuento: ");
			descuento = s.nextDouble();
			
			totalconiva = (totalsiniva * (iva/100))+totalsiniva;
			totaldescuento = totalconiva-(totalconiva * (descuento/100));
			
			System.out.printf("%s %.2f %s \n","Precio total sin IVA: " ,totalsiniva , "€");
			System.out.printf("%s %f %s \n","IVA: ",iva, "%");
			System.out.printf("%s %.2f %s \n","Precio total con IVA: " ,totalconiva , "€");
			System.out.printf("%s %f %s \n","Descuento: ",descuento, "%");
			System.out.printf("%s %.2f %s","Precio TOTAL con IVA y DESCUENTO aplicado: ", totaldescuento, "€");
			
        
    }
}
