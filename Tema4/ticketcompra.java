import java.util.Scanner; 
public class ticketcompra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String producto1;
        Float cantidad1;
        Float precio1;
        Float iva1;
        String producto2;
        Float cantidad2;
        Float precio2;
        Float iva2;
        String producto3;
        Float cantidad3;
        Float precio3;
        Float iva3;
        Float totalsin1;
        Float totalsin2;
        Float totalsin3;
        Float siniva;
        Float totalcon1;
        Float totalcon2;
        Float totalcon3;
        Float coniva;
        System.out.println("- - - T I C K E T  C O M P R A - - -");
        System.out.print("\n\nIntroduce el nombre del 1ª producto: ");
        producto1 = System.console().readLine();
        System.out.print("\n¿Cuántos " + producto1 + " quieres comprar?: ");
        cantidad1 = s.nextFloat();
        System.out.print("\nIntroduce el precio de cada " + producto1 + ": ");
        precio1 = s.nextFloat();
        System.out.print("\nIntroduce el IVA de " + producto1+ ": ");
        iva1 = s.nextFloat();
        System.out.print("\n\nIntroduce el nombre del 2ª producto: ");
        producto2 = System.console().readLine();
        System.out.print("\n¿Cuántos " + producto2 + " quieres comprar?: ");
        cantidad2 = s.nextFloat();
        System.out.print("\nIntroduce el precio de cada " + producto2+": ");
        precio2 = s.nextFloat();
        System.out.print("\nIntroduce el IVA de " + producto2+": ");
        iva2 = s.nextFloat();
        System.out.print("\n\nIntroduce el nombre del 3ª producto: ");
        producto3 = System.console().readLine();
        System.out.print("\n¿Cuántos " + producto3 + " quieres comprar?: ");
        cantidad3 = s.nextFloat();
        System.out.print("\nIntroduce el precio de cada " + producto3 + ": ");
        precio3 = s.nextFloat();
        System.out.print("\nIntroduce el IVA de " + producto3+": ");
        iva3 = s.nextFloat();
         totalsin1 = precio1*cantidad1;
         totalsin2 = precio2*cantidad2;
         totalsin3 = precio3*cantidad3;
         siniva = totalsin1+totalsin2+totalsin3;
         totalcon1 = (totalsin1 * iva1 / 100 )+ totalsin1;
         totalcon2 = (totalsin2 * iva2 / 100)+ totalsin2;
         totalcon3 = (totalsin3 * iva3 / 100)+ totalsin3;
         coniva = (totalcon1+totalcon2+totalcon3);
        System.out.println("\n\n - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\n - - - - - - - - - - - - - - - F A C T U R A - - - - - - - - - - - - - - -");
        System.out.printf("%-13s %10s %10s %8s %12s %10s\n","PRODUCTO","CANTIDAD","PRECIO/UNIDAD","IVA","P/SIN IVA","P/IVA");
        System.out.printf("%-13s %10.2f %10.2f %10.2f %12.2f %12.2f\n",producto1,cantidad1,precio1,iva1,totalsin1,totalcon1);
        System.out.printf("%-13s %10.2f %10.2f %10.2f %12.2f %12.2f\n",producto2,cantidad2,precio2,iva2,totalsin2,totalcon2);
        System.out.printf("%-13s %10.2f %10.2f %10.2f %12.2f %12.2f\n",producto3,cantidad3,precio3,iva3,totalsin3,totalcon3);
        System.out.println("\n\n - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

    }
}
        