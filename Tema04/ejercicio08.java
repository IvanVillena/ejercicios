import java.util.Scanner;
public class ejercicio08 {
    public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;
        String boletin;
        
        System.out.print("Introduce la 1º nota: ");
			nota1 = s.nextDouble();
        System.out.print("\nIntroduce la 2º nota: ");
			nota2 = s.nextDouble();
        System.out.print("\nIntroduce la 3º nota: ");
        
        nota3 = s.nextDouble();
        media = (nota1+nota2+nota3)/3;
        
        if ( (media < 5 ) && (media >= 0) ) {
            boletin = "insuficiente";
        } else if ( (media >= 5) && (media <6) ) {
                boletin = "suficiente";
            } else if  ( (media >= 6) && (media < 7 )){
                    boletin = "bien";
                } else if ( (media >=7) && (media<9) ) {
                        boletin = "notable";
                    } else if ( (media>=9) && (media <=10)) {
                            boletin = "sobresaliente";
                        } else {
                            System.out.println("ERROR, LA MEDIA DA UN NÚMERO INFERIOR A 0 o SUPERIOR A 10");
							}
        System.out.printf("La media entre las notas: %.2f %.2f y %.2f es %.2f. ",nota1, nota2, nota3, media);
        System.out.println("Has sacado un " + boletin);
    }
}
